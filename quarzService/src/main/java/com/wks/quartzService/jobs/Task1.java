package com.wks.quartzService.jobs;

import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.scheduling.quartz.QuartzJobBean;

import javax.annotation.Resource;
import java.util.List;


public class Task1 extends QuartzJobBean {

  @Override
  protected void executeInternal(JobExecutionContext context) throws JobExecutionException {

    System.out.printf("Task执行");

  }
}
