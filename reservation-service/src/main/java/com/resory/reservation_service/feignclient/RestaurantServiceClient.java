package com.resory.reservation_service.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "restaurant-service")
public interface RestaurantServiceClient {

    @GetMapping("/restaurants/{restaurantId}")
    Optional<RestaurantDto> getRestaurantById(@PathVariable("restaurantId") String restaurantId);
}