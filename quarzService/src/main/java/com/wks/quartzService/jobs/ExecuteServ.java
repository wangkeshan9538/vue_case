package com.wks.quartzService.jobs;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("executeServ")
public class ExecuteServ {

  public int m;

  @PostConstruct
  public void initM(){
    m=2;
  }

}
