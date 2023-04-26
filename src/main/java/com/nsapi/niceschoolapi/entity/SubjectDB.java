package com.nsapi.niceschoolapi.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.nsapi.niceschoolapi.common.base.DataEntity;

import java.io.Serializable;

/**
 * @author Leon
 * @filename Subject
 * @description 课程
 * @date 2023/4/26 23:35
 */
public class SubjectDB implements Serializable {

    private Integer subjectId; //课程ID

    private String subjectNo;//课程代码

    private String subjectName; //课程名称

    private String score;//学分

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
