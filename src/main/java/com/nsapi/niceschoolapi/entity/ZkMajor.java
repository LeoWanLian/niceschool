package com.nsapi.niceschoolapi.entity;

import java.io.Serializable;

/**
 * 自考专业表
 */

public class ZkMajor implements Serializable {

  private Integer pid; //自考专业编号
  private String pname; //自考专业名称

  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }

  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }
}
