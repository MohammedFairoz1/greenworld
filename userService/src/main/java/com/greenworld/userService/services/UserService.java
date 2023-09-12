package com.greenworld.userService.services;

import com.greenworld.userService.entities.User;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    User getUser(String userId);

}
