package com.pb.system.service;

import com.pb.common.service.IService;
import com.pb.system.domain.UserRole;

public interface UserRoleService extends IService<UserRole> {

	void deleteUserRolesByRoleId(String roleIds);

	void deleteUserRolesByUserId(String userIds);
}
