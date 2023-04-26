package com.nsapi.niceschoolapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nsapi.niceschoolapi.entity.ZkMajor;

import java.util.List;

public interface ZkMajorService extends IService<ZkMajor> {

    long getMajorNameCount(String name);

    ZkMajor saveMajor(ZkMajor ZkMajor);

    ZkMajor getMajorById(Integer id);

    void updateMajor(ZkMajor ZkMajor);

    void deleteMajorById(Integer pid);

    List<ZkMajor> selectAll();
}
