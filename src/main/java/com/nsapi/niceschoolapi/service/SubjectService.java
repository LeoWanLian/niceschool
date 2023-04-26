package com.nsapi.niceschoolapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nsapi.niceschoolapi.entity.SubjectDB;

import java.util.List;

/**
 * @author Leon
 * @filename SubjectService
 * @description 课程service
 * @date 2023/4/26 23:43
 */
public interface SubjectService  extends IService<SubjectDB> {

    List<SubjectDB> selectAllSubjects();

}
