package com.nsapi.niceschoolapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nsapi.niceschoolapi.entity.ZkMajor;
import com.nsapi.niceschoolapi.mapper.ZkMajorMapper;
import com.nsapi.niceschoolapi.service.ZkMajorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class ZkMajorServiceImpl extends ServiceImpl<ZkMajorMapper, ZkMajor> implements ZkMajorService {

    @Override
    public long getMajorNameCount(String name) {
        QueryWrapper<ZkMajor> wrapper = new QueryWrapper<>();
        wrapper.eq("pname",name);
        return baseMapper.selectCount(wrapper);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ZkMajor saveMajor(ZkMajor major) {
        baseMapper.insert(major);
        return major;
    }

    @Override
    public ZkMajor getMajorById(Integer id) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("pid",id);
        return baseMapper.selectOne(wrapper);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateMajor(ZkMajor major) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("pid",major.getPid());
        baseMapper.update(major,wrapper);
//        baseMapper.dropMajorMenus(role.getId());
//        if(role.getMenuSet() != null && role.getMenuSet().size() > 0) {
//            baseMapper.saveMajorMenus(role.getId(), role.getMenuSet());
//        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteMajorById(Integer pid) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("pid",pid);
        baseMapper.delete(wrapper);
//        role.setDelFlag(true);
//        baseMapper.updateById(role);
//        baseMapper.dropMajorMenus(role.getId());
//        baseMapper.dropMajorUsers(role.getId());
    }

    @Override
    public List<ZkMajor> selectAll() {
        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.eq("del_flag",false);
        return baseMapper.selectList(wrapper);
    }

}
