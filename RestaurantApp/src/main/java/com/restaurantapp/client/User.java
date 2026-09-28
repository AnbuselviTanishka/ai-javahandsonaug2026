package com.restaurantapp.client;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import com.restaurantapp.exception.RestaurantNotFoundException;
import com.restaurantapp.model.Cusine;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.RestaurantType;
import com.restaurantapp.service.IRestaurantService;
import com.restaurantapp.service.RestaurantServiceImpl;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Restaurant restaurant=new Restaurant("A2B",600,Cusine.SI.getCusineType(),RestaurantType.VEG.name(),4,"Bengaluru",LocalTime.of(8,0),LocalTime.of(10,0));
//Restaurant restaurant = new Restaurant("ICH",400,Cusine.SI.getCusineType(),RestaurantType.VEG.name(),4,"Neyveli",LocalTime.of(8,0),LocalTime.of(10,0));
//Restaurant restaurant1=	new Restaurant("Ambur Briyani",1000,Cusine.SI.getCusineType(),RestaurantType.NONVEG.name(),4,"Madurai",LocalTime.of(8,0),LocalTime.of(10,0));

		IRestaurantService restaurantService = new RestaurantServiceImpl();
//restaurantService.addRestaurant(restaurant);
//restaurantService.addRestaurant(restaurant1);
		/* restaurantService.updateRestaurant(1, 400); */
//restaurantService.deleteRestaurant(13);
		List<Restaurant> restaurantName = restaurantService.getAllRestaurants();
		restaurantName.stream().forEach(System.out::println);

		System.out.println();

		Restaurant restaurant = restaurantService.getByID(11);
		System.out.println(restaurant);
		System.out.println();

		try {
			List<Restaurant> restaurantCusineCost = restaurantService.getByCusineLesserCost("CONTINENTAL", 1600);
			restaurantCusineCost.stream().forEach(System.out::println);
		} catch (RestaurantNotFoundException e) {
			System.out.println("Notice: " + e.getMessage());
		}
		try {
			List<Restaurant> restaurantTypeCost = restaurantService.getByTypeLesserCost("VEG", 1000);
			restaurantTypeCost.stream().forEach(System.out::println);
		} catch (RestaurantNotFoundException e) {
			System.out.println("Notice: " + e.getMessage());
		}
		System.out.println();
		try {
			List<Restaurant> restaurantCity = restaurantService.getByCities("Bangalore");
			restaurantCity.stream().forEach(System.out::println);
		} catch (RestaurantNotFoundException e) {
			System.out.println("Notice: " + e.getMessage());
		}
		System.out.println();
		try {
			List<Restaurant> restaurantTypeRating = restaurantService.getByRatingsAndType("NONVEG", 4);
			restaurantTypeRating.stream().forEach(System.out::println);
		} catch (RestaurantNotFoundException e) {
			System.out.println("Notice: " + e.getMessage());
		}
		System.out.println();
		try {
			List<Restaurant> restaurantTime = restaurantService.getByTime(LocalTime.of(8,0));
			restaurantTime.stream().forEach(System.out::println);
		} catch (RestaurantNotFoundException e) {
			System.out.println("Notice: " + e.getMessage());
		}
	}
}
