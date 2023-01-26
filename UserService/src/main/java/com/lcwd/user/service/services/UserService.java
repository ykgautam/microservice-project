package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {
    // user operation

    // create user
    User saveUser(User user);

    // get all user
    List<User> getAllUser();

    // get single user
    User getSingleUser(String userId);
}
