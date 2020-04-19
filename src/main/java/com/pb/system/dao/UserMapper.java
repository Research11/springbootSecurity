package com.pb.system.dao;



import java.util.List;

import com.pb.common.config.MyMapper;
import com.pb.system.domain.MyUser;
import com.pb.system.domain.UserWithRole;

public interface UserMapper extends MyMapper<MyUser> {
    
    List<MyUser> findUserWithDept(MyUser user);

    List<UserWithRole> findUserWithRole(Long userId);

    MyUser findUserProfile(MyUser user);
}