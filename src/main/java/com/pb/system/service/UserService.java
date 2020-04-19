package com.pb.system.service;

import java.io.IOException;
import java.util.List;

import com.pb.common.service.IService;
import com.pb.system.domain.MyUser;
import com.pb.system.domain.UserWithRole;

public interface UserService extends IService<MyUser> {

    MyUser findByNameOrMobile(String username);

    UserWithRole findById(Long userId);

    MyUser findByName(String userName);

    List<MyUser> findUserWithDept(MyUser user);

    void registUser(MyUser user);

    void updateTheme(String theme, String userName);

    void addUser(MyUser user, Long[] roles);

    void updateUser(MyUser user, Long[] roles);

    void deleteUsers(String userIds);

    void updateLoginTime(String userName);

    void updatePassword(String password, String username) throws IOException;

    MyUser findUserProfile(MyUser user);

    void updateUserProfile(MyUser user);

    void mobileBind(String username, String mobile);

    void mobileUnbind(String username, String mobile);
}
