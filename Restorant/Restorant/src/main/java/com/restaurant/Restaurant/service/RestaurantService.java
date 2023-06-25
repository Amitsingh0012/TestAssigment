package com.restaurant.Restaurant.service;

import com.restaurant.Restaurant.model.Restaurant;
import com.restaurant.Restaurant.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> getAllRestaurant() {
        return restaurantRepo.getListRestorant();
    }

    public String createUser(Restaurant restaurant) {
        List<Restaurant> originalList=getAllRestaurant();
        originalList.add(restaurant);
        return "Restaurant add successfully";
    }


    public String updateRestaurantStatus(Integer restaurantId, String restaurantSpeciality) {
        List<Restaurant> originalList=getAllRestaurant();
        for(Restaurant myRestaurant:originalList){
            if (myRestaurant.getRestaurantId().equals(restaurantId)){
                myRestaurant.setSpeciality(restaurantSpeciality);
                return "Restaurant updated for Restaurant Id: " + restaurantId;

            }
        }
        return "Restaurant not found by Restaurant Id: "+restaurantId;


    }

    public String removeRestaurant(Integer restaurantId) {
        List<Restaurant> originalList=getAllRestaurant();
        for(Restaurant myRestaurant:originalList){
            if (myRestaurant.getRestaurantId().equals(restaurantId)) {
                restaurantRepo.remove((myRestaurant));
                return "Restaurant removed for Restaurant Id: "+restaurantId;
            }
        }
        return "Restaurant not found by Restaurant Id: "+restaurantId;
    }
}
