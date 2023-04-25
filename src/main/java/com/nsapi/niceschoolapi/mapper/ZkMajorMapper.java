package com.nsapi.niceschoolapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nsapi.niceschoolapi.entity.Menu;
import com.nsapi.niceschoolapi.entity.Role;
import com.nsapi.niceschoolapi.entity.ZkMajor;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

public interface ZkMajorMapper extends BaseMapper<ZkMajor> {

    void saveRoleMenus(@Param("roleId") String roleId,  @Param("menus") Set<Menu> menuSet);

    ZkMajor selectRoleById(@Param("roleId") String roleId);

    void dropRoleMenus(@Param("roleId") String roleId);

    void dropRoleUsers(@Param("roleId") String roleId);
}