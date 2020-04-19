package com.pb.system.service;



import java.util.List;

import com.pb.common.service.IService;
import com.pb.system.domain.UserConnection;

public interface UserConnectionService extends IService<UserConnection> {

    boolean isExist(String userId, String providerId);

    List<UserConnection> findByProviderUserId(String providerUserId);

    void delete(UserConnection userConnection);
}
