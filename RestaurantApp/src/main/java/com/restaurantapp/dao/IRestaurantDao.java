package com.restaurantapp.dao;

import java.time.LocalTime;
import java.util.List;

import com.restaurantapp.model.Restaurant;

public interface IRestaurantDao {
	void addRestaurant(Restaurant restaurant);
	void updateRestaurant(int restaurantId,double cost);
	Restaurant findById(int restaurantId);
	void deleteRestaurant(int restaurantId);
	
	// by the user
	List<Restaurant> findAllRestaurants();
	// find by cuisine , lessercost
	List<Restaurant> findByCuisineLesserCost(String cuisine, double cost);
	// find by type , lessercost
	List<Restaurant> findByTypeLesserCost(String type, double cost);
	// find the restaurants by Time
	List<Restaurant> findByTime(LocalTime availabiltyTime);
	// find by type , high ratings
	List<Restaurant> findByRatingsAndType(String type, int ratings);
	
	// find by city
	List<Restaurant> findByCity(String city);
}
