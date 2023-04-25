package com.nsapi.niceschoolapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nsapi.niceschoolapi.entity.Role;
import com.nsapi.niceschoolapi.entity.ZkMajor;
import com.nsapi.niceschoolapi.mapper.RoleMapper;
import com.nsapi.niceschoolapi.mapper.ZkMajorMapper;
import com.nsapi.niceschoolapi.service.RoleService;
import com.nsapi.niceschoolapi.service.ZkMajorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class ZkMajorServiceImpl extends ServiceImpl<ZkMajorMapper, ZkMajor> implements ZkMajorService {

    @Override
    public long getRoleNameCount(String name) {
        QueryWrapper<ZkMajor> wrapper = new QueryWrapper<>();
        wrapper.eq("name",name);
        return baseMapper.selectCount(wrapper);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ZkMajor saveRole(ZkMajor role) {
        baseMapper.insert(role);
//        if(role.getMenuSet() != null && role.getMenuSet().size() > 0) {
//            baseMapper.saveRoleMenus(role.getId(),role.getMenuSet());
//        }
        return role;
    }

    @Override
    public ZkMajor getRoleById(String id) {
        return baseMapper.selectRoleById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateRole(ZkMajor role) {
        baseMapper.updateById(role);
//        baseMapper.dropRoleMenus(role.getId());
//        if(role.getMenuSet() != null && role.getMenuSet().size() > 0) {
//            baseMapper.saveRoleMenus(role.getId(), role.getMenuSet());
//        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteRole(ZkMajor role) {
//        role.setDelFlag(true);
//        baseMapper.updateById(role);
//        baseMapper.dropRoleMenus(role.getId());
//        baseMapper.dropRoleUsers(role.getId());
    }

    @Override
    public List<ZkMajor> selectAll() {
        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.eq("del_flag",false);
        return baseMapper.selectList(wrapper);
    }
}
