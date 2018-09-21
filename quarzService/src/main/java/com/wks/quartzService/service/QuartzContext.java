package com.wks.quartzService.service;


import com.wks.quartzService.vo.JobDetailVO;
import com.wks.quartzService.vo.TriggerInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.quartz.Trigger.TriggerState;

@Component
@Slf4j
public class QuartzContext {

  public static String GROUP_NAME = "GROUP";

  @Resource
  Scheduler scheduler;

  @PostConstruct
  public void testSchedulerHaveInjected() {
    Assert.notNull(scheduler, "is null ");
  }


  public void addjobs(String id, String desc, String className) throws SchedulerException, ClassNotFoundException {
    Class c = null;
    c = Class.forName(className);
    JobDetail jd = JobBuilder
      .newJob(c)
      .withIdentity(id, GROUP_NAME)
      .withDescription(desc)
      .storeDurably()
      .build();
    scheduler.addJob(jd, false);
  }


  public CronTrigger addTrigger(String jobId, String triggerID, String desc, String cron) throws SchedulerException {
    CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cron);
    return TriggerBuilder
      .newTrigger()
      .forJob(scheduler.getJobDetail(getJobKey(jobId)))
      .withIdentity(triggerID, GROUP_NAME)
      .withSchedule(scheduleBuilder)
      .withDescription(desc)
      .build();
  }

  public void pauseJob(String jobId) throws SchedulerException {
    scheduler.pauseJob(getJobKey(jobId));
  }

  public void pauseTrigger(String triggerID) throws SchedulerException {
    scheduler.pauseTrigger(getTriggerKey(triggerID));
  }

  public CronTrigger updateTriggrtOfJob(String triggerID, String desc, String cron) throws SchedulerException {
    JobKey jd = scheduler.getTrigger(getTriggerKey(triggerID)).getJobKey();

    scheduler.unscheduleJob(getTriggerKey(triggerID));

    CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cron);

    return TriggerBuilder
      .newTrigger()
      .forJob(scheduler.getJobDetail(jd))
      .withIdentity(getTriggerKey(triggerID))
      .withSchedule(scheduleBuilder)
      .withDescription(desc)
      .build();
  }

  public List<JobDetailVO> getAllJobsAndTrigger() throws SchedulerException {

    Set<JobKey> jobs = scheduler.getJobKeys(GroupMatcher.jobGroupEquals(GROUP_NAME));

    List<JobDetailVO> jobVo = new ArrayList<>();

    for (JobKey job : jobs) {
      JobDetailVO vo = new JobDetailVO();
      JobDetail jd = scheduler.getJobDetail(job);

      vo.setId(job.getName());
      vo.setDesc(jd.getDescription());
      vo.setTargetClass(jd.getJobClass().getName());
      List<? extends Trigger> triggerList = scheduler.getTriggersOfJob(job);
      List<TriggerInfoVO> triggerVO = new ArrayList<>();

      for (Trigger t : triggerList) {
        TriggerInfoVO triggerInfo = new TriggerInfoVO();

        triggerInfo.setId(t.getKey().getName());
        triggerInfo.setDesc(t.getDescription());

        CronTrigger c = (CronTrigger) t;
        triggerInfo.setCron(c.getCronExpression());

        TriggerState state = scheduler.getTriggerState(t.getKey());
        triggerInfo.setState(getState(state));

        triggerVO.add(triggerInfo);
      }

      vo.setTriggers(triggerVO);

      jobVo.add(vo);
    }

    return jobVo;

  }

  public void deleteJob(String jobid) throws SchedulerException {
    scheduler.deleteJob(getJobKey(jobid));
  }

  public void deleteTrigger(String trigger) throws SchedulerException {
    scheduler.unscheduleJob(getTriggerKey(trigger));
  }

  public void triggerJob(String job) throws SchedulerException {
    scheduler.triggerJob(getJobKey(job));
  }


  private JobKey getJobKey(String job) {
    return new JobKey(job, GROUP_NAME);
  }

  private TriggerKey getTriggerKey(String trigger) {
    return getTriggerKey(trigger);
  }


  public int getState(TriggerState state) {

    switch (state) {
      case NORMAL:
        return 0;
      case ERROR:
        return 2;
      case PAUSED:
        return 1;
      case BLOCKED:
        return 4;
      case NONE:
        return -1;
      case COMPLETE:
        return 2;

    }
    return 3;
  }
}
