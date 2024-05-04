package com.userservice.service.impl;

import com.userservice.entity.User;
import com.userservice.exception.UserNotFoundException;
import com.userservice.repository.UserRepository;
import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User CreateUser(User user) {
        try { return userRepository.save(user);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<User> AllUsers() {
        try{
            return userRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public User GetUser(int id) {
        try {
            return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException("user not found at server id = "+id));
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
