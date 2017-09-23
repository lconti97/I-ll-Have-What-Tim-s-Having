package com.lconti.illhavewhattimshaving;


public class Lunch {
    private String restaurant;
    private String meal;

    public Lunch(String restaurant, String meal) {
        this.restaurant = restaurant;
        this.meal = meal;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }
}
