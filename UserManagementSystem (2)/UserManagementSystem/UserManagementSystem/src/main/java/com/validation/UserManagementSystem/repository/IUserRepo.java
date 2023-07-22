package com.validation.UserManagementSystem.repository;

import com.validation.UserManagementSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
