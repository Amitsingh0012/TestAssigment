package com.restaurant.Restaurant.repository;

import com.restaurant.Restaurant.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {
    @Autowired
    private List<Restaurant> listRestorant;
    public List<Restaurant> getListRestorant(){
        return listRestorant;
    }

    public void remove(Restaurant myRestaurant) {
        listRestorant.remove(myRestaurant);
    }
}
