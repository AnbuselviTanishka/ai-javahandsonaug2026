package com.restaurantapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.List;

import com.restaurantapp.dao.IRestaurantDao;
import com.restaurantapp.dao.RestaurantDaoImpl;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.util.Queries;
import com.restaurantapp.util.RestaurantConnect;

public class RestaurantServiceImpl implements IRestaurantService {
	private IRestaurantDao restaurantDao = new RestaurantDaoImpl();

	@Override
	public void addRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		restaurantDao.addRestaurant(restaurant);

	}

	@Override
	public Restaurant getByID(int restaurantID) {
		// TODO Auto-generated method stub
		return restaurantDao.findById(restaurantID);
		 
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		// TODO Auto-generated method stub
		List<Restaurant> restuarants = restaurantDao.findAllRestaurants();
		return restuarants;
	}

	@Override
	public List<Restaurant> getByCusineLesserCost(String cusine, double cost) {
		// TODO Auto-generated method stub

		return restaurantDao.findByCuisineLesserCost(cusine, cost);
	}

	@Override
	public List<Restaurant> getByTypeLesserCost(String type, double cost) {
		// TODO Auto-generated method stub
		return restaurantDao.findByTypeLesserCost(type, cost);
	}

	@Override
	public List<Restaurant> getByRatingsAndType(String type, int ratings) {
		// TODO Auto-generated method stub
		return restaurantDao.findByRatingsAndType(type, ratings);
	}

	@Override
	public List<Restaurant> getByCities(String city) {
		// TODO Auto-generated method stub
		return restaurantDao.findByCity(city);
	}

	@Override
	public void updateRestaurant(int restaurantId, double cost) {
		// TODO Auto-generated method stub
		restaurantDao.updateRestaurant(restaurantId, cost);
	}
    
	@Override
	public List<Restaurant> getByTime(LocalTime availabiltyTime) {
		// TODO Auto-generated method stub
		return restaurantDao.findByTime(availabiltyTime);
	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		restaurantDao.deleteRestaurant(restaurantId);

	}

}
