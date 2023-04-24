package com.nsapi.niceschoolapi.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * 学生表
 */

public class ZkStudentDB implements Serializable {

  private Integer sid; //学生编号
  private String stuid; //准考证号
  private String sname; //姓名
  private String sgender; //性别
  private Date sbirthday; //出生年月
//  private Integer pid; //政治面貌编号
  private Integer pid; //报考专业编号
  private String partner; //合作伙伴
  private String scardid; //身份证号
  private String sphone; //手机号
  private String subpartner; //分合作伙伴
  
  
  private String level; //报考层次
  private Date entertime; //入学时间
  private Date leavetime; //毕业时间
  private String school;//主考院校
  private String firstcost;//第一年管理费
  private String secondtcost;//第二年管理费
  private Integer stustate; //学生状态
  private Integer academicdegree; //是否学位
  private String year;//年度码
  private Integer isDel; //逻辑删除

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }

  public String getScardid() {
    return scardid;
  }

  public void setScardid(String scardid) {
    this.scardid = scardid;
  }

  public Integer getSid() {
    return sid;
  }

  public void setSid(Integer sid) {
    this.sid = sid;
  }

  public String getStuid() {
    return stuid;
  }

  public void setStuid(String stuid) {
    this.stuid = stuid;
  }

  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }

  public String getSgender() {
    return sgender;
  }

  public void setSgender(String sgender) {
    this.sgender = sgender;
  }

  public Date getSbirthday() {
    return sbirthday;
  }

  public void setSbirthday(Date sbirthday) {
    this.sbirthday = sbirthday;
  }

  public String getPartner() {
    return partner;
  }

  public void setPartner(String partner) {
    this.partner = partner;
  }

  public String getSubpartner() {
    return subpartner;
  }

  public void setSubpartner(String subpartner) {
    this.subpartner = subpartner;
  }

  public String getSphone() {
    return sphone;
  }

  public void setSphone(String sphone) {
    this.sphone = sphone;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public Date getEntertime() {
    return entertime;
  }

  public void setEntertime(Date entertime) {
    this.entertime = entertime;
  }

  public Date getLeavetime() {
    return leavetime;
  }

  public void setLeavetime(Date leavetime) {
    this.leavetime = leavetime;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public String getFirstcost() {
    return firstcost;
  }

  public void setFirstcost(String firstcost) {
    this.firstcost = firstcost;
  }

  public String getSecondtcost() {
    return secondtcost;
  }

  public void setSecondtcost(String secondtcost) {
    this.secondtcost = secondtcost;
  }

  public Integer getStustate() {
    return stustate;
  }

  public void setStustate(Integer stustate) {
    this.stustate = stustate;
  }

  public Integer getAcademicdegree() {
    return academicdegree;
  }

  public void setAcademicdegree(Integer academicdegree) {
    this.academicdegree = academicdegree;
  }

  public Integer getIsDel() {
    return isDel;
  }

  public void setIsDel(Integer isDel) {
    this.isDel = isDel;
  }
}
