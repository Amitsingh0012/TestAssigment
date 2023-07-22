package com.validation.UserManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    private Integer UserId;
    @NotBlank(message = "name cannot be blank")
    private String username;
    @NotNull
    private  LocalDate DateOfBirth;
    @Email
    private String email;
    @Pattern(regexp="\\d{10}")
    private String PhoneNumber;
    @NotNull
    private LocalDate Date;
    @NotNull
    private LocalTime Time;

}
