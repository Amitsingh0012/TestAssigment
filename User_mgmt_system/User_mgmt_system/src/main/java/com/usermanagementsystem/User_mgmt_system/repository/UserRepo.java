package com.usermanagementsystem.User_mgmt_system.repository;

import com.usermanagementsystem.User_mgmt_system.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    private List<User> users;
    public List<User> getAllUsers() {
        return users;
    }

    public void add(User user) {
        users.add(user);
    }

    public void remove(User user) {
        users.remove(user);
    }
}