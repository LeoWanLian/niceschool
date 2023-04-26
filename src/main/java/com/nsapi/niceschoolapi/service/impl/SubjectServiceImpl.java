package com.nsapi.niceschoolapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nsapi.niceschoolapi.entity.SubjectDB;
import com.nsapi.niceschoolapi.mapper.SubjectMapper;
import com.nsapi.niceschoolapi.service.SubjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Leon
 * @filename SubjectServiceImpl
 * @description
 * @date 2023/4/26 23:45
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, SubjectDB> implements SubjectService {

    @Override
    public List<SubjectDB> selectAllSubjects() {
        QueryWrapper wrapper = new QueryWrapper();
        return baseMapper.selectList(wrapper);
    }
}
