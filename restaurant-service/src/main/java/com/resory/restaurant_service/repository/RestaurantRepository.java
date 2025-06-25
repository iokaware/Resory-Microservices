package com.resory.restaurant_service.repository;

import com.resory.restaurant_service.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, String> {
    List<Restaurant> findByLocation(String location);
}