package com.wks.quartzService.config;

import com.wks.quartzService.jobs.Task1;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

  @Bean
  public JobDetail uploadTaskDetail() {
    return JobBuilder.newJob(Task1.class).withIdentity("uploadTask").storeDurably().build();
  }

  @Bean
  public Trigger uploadTaskTrigger() {
    CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("*/5 * * * * ?");
    return TriggerBuilder.newTrigger().forJob(uploadTaskDetail())
      .withIdentity("uploadTask")
      .withSchedule(scheduleBuilder)
      .build();
  }
}
