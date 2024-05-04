package com.userservice.controller;

import com.userservice.entity.User;
import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/adduser")
    public ResponseEntity<User> SaveUser(@RequestBody User user){
        try{
            User savedUser = userService.CreateUser(user);
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/all-users")
    public ResponseEntity<List<User>> AllUsers(){
        try{
            List<User> savedUsers = userService.AllUsers();
            return new ResponseEntity<>(savedUsers, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping ("/get-user")
    public ResponseEntity<User> getUsers(@RequestParam(value = "id") int id){
        try{
            User user = userService.GetUser(id);
            return new ResponseEntity<>(user, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
