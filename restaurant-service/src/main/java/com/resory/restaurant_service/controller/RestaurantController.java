package com.resory.restaurant_service.controller;

import com.resory.restaurant_service.model.Restaurant;
import com.resory.restaurant_service.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @PostMapping
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        restaurant.setRestaurantId(java.util.UUID.randomUUID().toString().replace("-", "")); // Generate UUID
        return restaurantRepository.save(restaurant);
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants(@RequestParam(required = false) String location) {
        if (location != null && !location.isEmpty()) {
            return restaurantRepository.findByLocation(location);
        }
        return restaurantRepository.findAll();
    }

    @GetMapping("/{restaurantId}")
    public Optional<Restaurant> getRestaurantById(@PathVariable String restaurantId) {
        return restaurantRepository.findById(restaurantId);
    }
}