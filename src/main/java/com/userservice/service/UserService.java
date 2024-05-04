package com.userservice.service;

import com.userservice.entity.User;

import java.util.List;

public interface UserService {

    public User CreateUser(User user);
    public List<User> AllUsers();
    public User GetUser(int id);
}
