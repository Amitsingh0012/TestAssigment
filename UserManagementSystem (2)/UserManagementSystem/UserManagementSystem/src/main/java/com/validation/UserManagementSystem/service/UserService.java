package com.validation.UserManagementSystem.service;

import com.validation.UserManagementSystem.entity.User;
import com.validation.UserManagementSystem.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public String addUsers(List<User> users){
        userRepo.saveAll(users);
        return "New Users Added";
    }

    public String addUser(User user){
        List<User> originalList =getAllUsers();
        originalList.add(user);
        return "New user added";
    }

    public User getUserById(Integer userId){
        for(User user : userRepo.findAll()){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        throw new IllegalStateException(("id not found"));
    }



    public String removeInfo(Integer userId){
        List<User> originalList= getAllUsers();
        for(User u : originalList){
            if(userId.equals(u.getUserId())){
                originalList.remove(u);
                return "removed";
            }
        }
        return "Id not found";
    }

    public String updateUserInfo(Integer userId, String userName, LocalDate dateOfBirth,
                                 String email, String phoneNumber, LocalDate date,
                                 LocalTime time) {
        User user=userRepo.getReferenceById(userId);
        user.setUsername(userName);
        user.setDateOfBirth(dateOfBirth);
        user.setPhoneNumber(phoneNumber);
        user.setTime(time);
        user.setEmail(email);
        user.setDate(date);
        return "Updated Successfully";
    }
}
