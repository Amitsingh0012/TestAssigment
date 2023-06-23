package com.usermanagementsystem.User_mgmt_system.controller;

import com.usermanagementsystem.User_mgmt_system.Service.UserService;
import com.usermanagementsystem.User_mgmt_system.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("users")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @PostMapping("user")
    public String addUser(@RequestBody User user)
    {
        return userService.addUsers(user);
    }
    @PutMapping("user/{userId}/{userName}/{address}/{phoneNumber}")
    public String updateUserInfo(@PathVariable Integer userId,@PathVariable String userName,@PathVariable String address,@PathVariable String phoneNumber)
    {
        return userService.updateUserInfo(userId,userName,address,phoneNumber);
    }
    @DeleteMapping("user/{userId}")
    public String deleteUserInfo(@PathVariable Integer userId)
    {
        return userService.removeInfo(userId);
    }


    @GetMapping("userById/{userId}")
    public User getUserById(@PathVariable Integer userId)
    {
        return userService.getUserById(userId);
    }
}