package com.pb.system.dao;



import java.util.List;

import com.pb.common.config.MyMapper;
import com.pb.system.domain.Role;
import com.pb.system.domain.RoleWithMenu;

public interface RoleMapper extends MyMapper<Role> {
	
	List<Role> findUserRole(String userName);
	
	List<RoleWithMenu> findById(Long roleId);
}