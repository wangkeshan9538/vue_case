package com.wks.quartzService.jobs;

import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.scheduling.quartz.QuartzJobBean;

import javax.annotation.Resource;
import java.util.List;


public class Task1 extends QuartzJobBean {


  public int v;

  @Resource(name="executeServ")
  private ExecuteServ executeServ;

  public void setExecuteServ(ExecuteServ executeServ) {
    this.executeServ = executeServ;
  }

  @Override
  protected void executeInternal(JobExecutionContext context) throws JobExecutionException {

    System.out.printf("Task执行");

    System.out.printf("  "+executeServ.m+"  "+v);

    JobDetail jd=context.getJobDetail();

    //停止任务
    try {
      context.getScheduler().deleteJob(jd.getKey());
      //pauseJob rescheduleJob  delete

      //Pause the <code>{@link org.quartz.JobDetail}</code> with the given
      //key - by pausing all of its current <code>Trigger</code>s.
      context.getScheduler().pauseJob(jd.getKey()); //pause Job

      //Remove the indicated <code>{@link Trigger}</code> from the scheduler.
      //If the related job does not have any other triggers, and the job is
      //not durable, then the job will also be deleted.</p>
      context.getScheduler().unscheduleJob(context.getTrigger().getKey()); //remove all trigger

      //Delete the identified <code>Job</code> from the Scheduler - and any
      //     * associated <code>Trigger</code>s.
      context.getScheduler().deleteJob(jd.getKey()); //removeJob

      List<String> groups=context.getScheduler().getJobGroupNames();

      for(String s:groups){
        GroupMatcher<TriggerKey> triggerKeyGroupMatcher =GroupMatcher.groupEquals(s)  ;
        context.getScheduler().getTriggerKeys(triggerKeyGroupMatcher).iterator().next();
//        context.getScheduler().getTriggersOfJob();
      }

    } catch (SchedulerException e) {
      e.printStackTrace();
    }

    //增加job
    //context.getScheduler().addJob("");
    this.v++;

    //开启任务

    //修改任务时间

    //获得任务列表 及状态

    //立即触发
  }
}
