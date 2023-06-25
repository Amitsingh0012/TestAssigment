package com.restaurant.Restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private String name;
    private Integer restaurantId;
    private String address;
    private String number;
    private Integer total_Staff;
    private String speciality;
    private double rating;
    private  boolean reservation;
}
