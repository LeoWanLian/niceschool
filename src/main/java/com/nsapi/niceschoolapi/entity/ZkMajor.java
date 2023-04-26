package com.nsapi.niceschoolapi.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.Set;

/**
 * 自考专业表
 */
//@TableName("zk_major")
public class ZkMajor implements Serializable {

//    @TableField(strategy = FieldStrategy.IGNORED)
    private Integer pid; //自考专业编号

//    @TableField(strategy = FieldStrategy.IGNORED)
    private String pname; //自考专业名称

//    @TableField(strategy = FieldStrategy.IGNORED)
    private String remarks;//备注

    @TableField(exist = false)
    private Set<SubjectDB> subjectDBSet;//课程

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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Set<SubjectDB> getSubjectSet() {
        return subjectDBSet;
    }

    public void setSubjectSet(Set<SubjectDB> subjectDBSet) {
        this.subjectDBSet = subjectDBSet;
    }
}
