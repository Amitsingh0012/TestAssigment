package com.validation.UserManagementSystem.controller;

import com.validation.UserManagementSystem.entity.User;
import com.validation.UserManagementSystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@Validated
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("users")
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("userById/{userId}")
    public User getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }
    @PostMapping("users")
    public String addUsers(@Valid @RequestBody List<User> users){
        return userService.addUsers(users);
    }
    @PutMapping("user/{userId}/{userName}/{userDOB}/{userEmail}/{userPhoneNumber}/{userDate}/{userTime}")
    public String updateUserInfo(@PathVariable Integer userId, @PathVariable String userName, @PathVariable LocalDate dateOfBirth, @PathVariable String email, @PathVariable String phoneNumber, @PathVariable LocalDate date, @PathVariable LocalTime time){
        return userService.updateUserInfo(userId,userName,dateOfBirth,email,phoneNumber,date,time);
    }
    @DeleteMapping("user/{userId}")
    public String deleteUserInfo(@PathVariable Integer userId){
        return userService.removeInfo(userId);
    }
}
