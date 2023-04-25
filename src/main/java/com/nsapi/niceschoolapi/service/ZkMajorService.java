package com.nsapi.niceschoolapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nsapi.niceschoolapi.entity.Role;
import com.nsapi.niceschoolapi.entity.ZkMajor;

import java.util.List;

public interface ZkMajorService extends IService<ZkMajor> {

    long getRoleNameCount(String name);

    ZkMajor saveRole(ZkMajor ZkMajor);

    ZkMajor getRoleById(String id);

    void updateRole(ZkMajor ZkMajor);

    void deleteRole(ZkMajor ZkMajor);

    List<ZkMajor> selectAll();
}
