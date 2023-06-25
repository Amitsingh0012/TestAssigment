package com.restaurant.Restaurant.controller;

import com.restaurant.Restaurant.model.Restaurant;
import com.restaurant.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @GetMapping("restaurant")
    List<Restaurant> getAllRestaurant(){
        return restaurantService.getAllRestaurant();
    }
    @PostMapping("addRestaurant")
    String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.createUser(restaurant);
    }
    @PutMapping("restro/{restaurantId}/{restaurantSpeciality}")
    public String changeSpeciality(@PathVariable Integer restaurantId, @PathVariable String restaurantSpeciality){
        return restaurantService.updateRestaurantStatus(restaurantId,restaurantSpeciality);
    }
    @DeleteMapping("restro/{restaurantId}")
    public String removeRestaurant(@PathVariable Integer restaurantId){
        return restaurantService.removeRestaurant(restaurantId);
    }
}
