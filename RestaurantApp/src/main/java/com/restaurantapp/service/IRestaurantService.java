package com.restaurantapp.service;
import java.time.LocalTime;
import java.util.List;

import com.restaurantapp.model.Restaurant;

public interface IRestaurantService {
void addRestaurant(Restaurant restaurant);
void updateRestaurant(int restaurantId,double cost);
Restaurant getByID(int restaurantID);
void deleteRestaurant(int restaurantId);

List<Restaurant> getAllRestaurants();
List<Restaurant> getByCusineLesserCost(String cusine,double cost);
List<Restaurant> getByTypeLesserCost(String type,double cost);
List<Restaurant> getByRatingsAndType(String type,int ratings);
List<Restaurant> getByCities(String city);
List<Restaurant> getByTime(LocalTime availabiltyTime);
}
