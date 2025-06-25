package com.resory.reservation_service.feignclient;


public class RestaurantDto {
    private String restaurantId;
    private String name;
    private String location;
    private String cuisine;
    private Double rating;
    private boolean familyFriendly;
    private boolean hasKidsMenu;

    public RestaurantDto() {
    }

    public RestaurantDto(String restaurantId, String name, String location, String cuisine, Double rating, boolean familyFriendly, boolean hasKidsMenu) {
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