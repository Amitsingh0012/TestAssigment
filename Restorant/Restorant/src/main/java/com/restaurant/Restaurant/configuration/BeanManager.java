package com.restaurant.Restaurant.configuration;

import com.restaurant.Restaurant.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
//    private String name;
//    private Integer restaurantId;
//    private String address;
//    private String number;
//    private Integer total_Staff;
//    private String speciality;
//    private float rating;
//    private  boolean reservation;

    @Bean
    public List<Restaurant> getIntializedList(){
        Restaurant initialized=new Restaurant("PizzaHut",890564,"Lucknow","9887096534",23,"Pizza",4.5,true);
        List<Restaurant> initList=new ArrayList<>();
        initList.add(initialized);
        return initList;
    }
}
