package com.pb.system.service;

import com.pb.common.service.IService;
import com.pb.system.domain.RoleMenu;

public interface RoleMenuServie extends IService<RoleMenu> {

	void deleteRoleMenusByRoleId(String roleIds);

	void deleteRoleMenusByMenuId(String menuIds);
}
