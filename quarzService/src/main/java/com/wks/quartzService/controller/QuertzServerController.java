package com.wks.quartzService.controller;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.wks.quartzService.service.QuartzContext;
 import lombok.extern.slf4j.Slf4j;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;


/**
 *  定时任务管理controller
 *  包含 ：
 *  增加任务；
 *  增加触发规则
 *  暂停任务；
 *  暂停触发规则；
 *  修改任务的调用规则
 *  获得任务的 列表和 触发器列表
 *  删除任务
 *  删除触发规则
 *  触发任务
 *
 *  基础查询
 *
 */


@RestController
@Slf4j
@RequestMapping("quartz")
public class QuertzServerController {

  @Autowired
  QuartzContext context;

  @PostMapping("addjobs")
  public ResponseEnum  addjobs(@RequestBody  ObjectNode request){
    try {
      context.addjobs(
        request.get("id").asText(),
        request.get("desc").asText(),
        request.get("className").asText()
      );
    } catch (SchedulerException e) {
      log.error("增加 JOB 错误",e);
      return ResponseEnum.FAILURE;
    } catch (ClassNotFoundException e) {
      log.error("增加 JOB 错误:无此JOB CLass", e);
      return ResponseEnum.FAILURE;
    }

    return ResponseEnum.SUCCESS;
  }

  public void  addTrigger(){

  }

  public void  pauseJob(){}

  public void  pauseTrigger(){}

  public void  updateTriggrtOfJob(){}

  public void getAllJobsAndTrigger(){}

  public void deleteJob(){}

  public void deleteTrigger(){}

  public void triggerJob(){}


}
