package com.resory.restaurant_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import lombok.Data;

@Entity
//@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String restaurantId;
    private String name;
    private String location;
    private String cuisine;
    private Double rating;
    private boolean familyFriendly;
    private boolean hasKidsMenu;

    public Restaurant() {
    }

    public Restaurant(String restaurantId, String name, String location, String cuisine, Double rating, boolean familyFriendly, boolean hasKidsMenu) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.location = location;
        this.cuisine = cuisine;
        this.rating = rating;
        this.familyFriendly = familyFriendly;
        this.hasKidsMenu = hasKidsMenu;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCuisine() {
        return cuisine;
    }

    public Double getRating() {
        return rating;
    }

    public boolean isFamilyFriendly() {
        return familyFriendly;
    }

    public boolean isHasKidsMenu() {
        return hasKidsMenu;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setFamilyFriendly(boolean familyFriendly) {
        this.familyFriendly = familyFriendly;
    }

    public void setHasKidsMenu(boolean hasKidsMenu) {
        this.hasKidsMenu = hasKidsMenu;
    }
}