package com.wks.quartzService.controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.Setter;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ResponseEnum {

  SUCCESS("1000","操作正常"),

  FAILURE("1001","操作失败"),

  NONE_JOB("1002","无此CLASS文件");

  public String state;

  public String info;

  private ResponseEnum(String state,String info){
    this.state=state;
    this.info=info;
  }

  @JsonValue
  public String getState() {
    return state;
  }

  @JsonValue
  public String getInfo() {
    return info;
  }
}
