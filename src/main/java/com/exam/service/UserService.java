package com.exam.service;

import com.exam.model.User;
import com.exam.model.UserRole;

import java.util.Set;

public interface UserService {

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by userName
    public  User getUser(String username);

    //delete user by username
    public void deleteUser(Long id);

    //update user
    public void updateUser(Long userId);
}
