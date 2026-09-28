package com.restaurantapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.restaurantapp.exception.RestaurantNotFoundException;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.util.Queries;
import com.restaurantapp.util.RestaurantConnect;

public class RestaurantDaoImpl implements IRestaurantDao {

	@Override
	public void updateRestaurant(int restaurantId, double cost) {
		// TODO Auto-generated method stub
		Connection connection = RestaurantConnect.openConnection();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEQUERY);)

		{
			preparedStatement.setDouble(1, cost);
			preparedStatement.setInt(2, restaurantId);

			int updatedCount = preparedStatement.executeUpdate();
			System.out.print("updated row count " + updatedCount);

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		Connection connection = RestaurantConnect.openConnection();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.DELETEQUERY);)

		{
			preparedStatement.setInt(1, restaurantId);
			

			int deletedCount = preparedStatement.executeUpdate();
			System.out.print("Deleted row count " + deletedCount);

		}

		catch (SQLException e) {
			e.printStackTrace();
		}



	}

	@Override
	public void addRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		Connection connection = RestaurantConnect.openConnection();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERTQUERY);)

		{
			preparedStatement.setString(1, restaurant.getRestaurantName());
			preparedStatement.setString(2, restaurant.getCity());
			preparedStatement.setString(3, restaurant.getCusine());
			preparedStatement.setString(4, restaurant.getType());
			preparedStatement.setDouble(5, restaurant.getCostForTwo());
			preparedStatement.setObject(6, restaurant.getOpeningTime());
			preparedStatement.setObject(7, restaurant.getClosingTime());
			preparedStatement.setInt(8, restaurant.getRatings());

			int updatedCount = preparedStatement.executeUpdate();
			System.out.print("Inserted row count " + updatedCount);
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Restaurant findById(int restaurantId) {
		// TODO Auto-generated method stub
		Restaurant restaurant = new Restaurant();
		Connection connection = RestaurantConnect.openConnection();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETQUERYBYID);) {
			preparedStatement.setInt(1, restaurantId);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {

				restaurant.setRestaurantName(rs.getString("restaurant_name"));
				// get the columns from rs and set it in restaurant
				restaurant.setRestaurantId(rs.getInt("restuarant_id"));
				restaurant.setCity(rs.getString("city"));
				restaurant.setCusine(rs.getString("cusine"));
				restaurant.setType(rs.getString(5));
				restaurant.setCostForTwo(rs.getDouble(6));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return restaurant;
	}

	@Override
	public List<Restaurant> findAllRestaurants() {
		// TODO Auto-generated method stub
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
//	     get the connection 
		Connection connection = RestaurantConnect.openConnection();
//	     create the PreparedStatement using connection obj
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETALLQUERY);) {
			ResultSet rs = preparedStatement.executeQuery();

			// iterate thru the sresult set
			while (rs.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				String restaurantName = rs.getString(1);
				// set it
				restaurant.setRestaurantName(restaurantName);
				// get the columns from rs and set it in restaurant
				restaurant.setRestaurantId(rs.getInt("restuarant_id"));
				restaurant.setCity(rs.getString("city"));
				restaurant.setCusine(rs.getString("cusine"));
				restaurant.setType(rs.getString(5));
				restaurant.setCostForTwo(rs.getDouble(6));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add it to a list and return the list
				restaurants.add(restaurant);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return restaurants;

	}

	@Override
	public List<Restaurant> findByCuisineLesserCost(String cuisine, double cost) {
		// TODO Auto-generated method stub
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
//	     get the connection 
		Connection connection = RestaurantConnect.openConnection();
//	     create the PreparedStatement using connection obj
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETQUERYBYCUSINECOST);) {

			preparedStatement.setString(1, cuisine);
			preparedStatement.setDouble(2, cost);
			ResultSet rs = preparedStatement.executeQuery();

			// iterate thru the sresult set
			while (rs.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				// String restaurantName = rs.getString(1);
				// set it
				restaurant.setRestaurantName(rs.getString("restaurant_name"));
				// get the columns from rs and set it in restaurant
		        restaurant.setRestaurantId(rs.getInt("restuarant_id"));
				restaurant.setCity(rs.getString("city"));
				restaurant.setCusine(rs.getString("cusine"));
				restaurant.setType(rs.getString(5));
				restaurant.setCostForTwo(rs.getDouble(6));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add it to a list and return the list
				restaurants.add(restaurant);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (restaurants.isEmpty())
			throw new RestaurantNotFoundException("Restaurant not found");
		return restaurants;
	}

	@Override
	public List<Restaurant> findByTypeLesserCost(String type, double cost) {
		// TODO Auto-generated method stub\
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
//	     get the connection 
		Connection connection = RestaurantConnect.openConnection();
//	     create the PreparedStatement using connection obj
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETQUERYBYTYPELESSERCOST);) {

			preparedStatement.setString(1, type);
			preparedStatement.setDouble(2, cost);
			ResultSet rs = preparedStatement.executeQuery();

			// iterate thru the sresult set
			while (rs.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				// String restaurantName = rs.getString(1);
				// set it
				restaurant.setRestaurantName(rs.getString("restaurant_name"));
				// get the columns from rs and set it in restaurant
				restaurant.setRestaurantId(rs.getInt("restuarant_id"));
				restaurant.setCity(rs.getString("city"));
				restaurant.setCusine(rs.getString("cusine"));
				restaurant.setType(rs.getString("restuarant_type"));
				restaurant.setCostForTwo(rs.getDouble("cost_for_two"));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add it to a list and return the list
				restaurants.add(restaurant);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (restaurants.isEmpty())
			throw new RestaurantNotFoundException("Restaurant not found");
		return restaurants;
		
	}

	@Override
	public List<Restaurant> findByTime(LocalTime availabiltyTime) {
		// TODO Auto-generated method stub
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
//	     get the connection 
		Connection connection = RestaurantConnect.openConnection();
//	     create the PreparedStatement using connection obj
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETQUERYBYTIME);) {

			preparedStatement.setObject(1,availabiltyTime);
			
			ResultSet rs = preparedStatement.executeQuery();

			// iterate thru the sresult set
			while (rs.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				// String restaurantName = rs.getString(1);
				// set it
				restaurant.setRestaurantName(rs.getString("restaurant_name"));
				// get the columns from rs and set it in restaurant
				restaurant.setRestaurantId(rs.getInt("restuarant_id")); 
				restaurant.setCity(rs.getString("city"));
				restaurant.setCusine(rs.getString("cusine"));
				restaurant.setType(rs.getString("restuarant_type"));
				restaurant.setCostForTwo(rs.getDouble(6));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject("closing_time", LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add it to a list and return the list
				restaurants.add(restaurant);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (restaurants.isEmpty())
			throw new RestaurantNotFoundException("Restaurant not found");
		return restaurants;
		
	}

	@Override
	public List<Restaurant> findByRatingsAndType(String type, int ratings) {
		// TODO Auto-generated method stub
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
//	     get the connection 
		Connection connection = RestaurantConnect.openConnection();
//	     create the PreparedStatement using connection obj
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETQUERYBYCTYPERATINGS);) {

			preparedStatement.setString(1, type);
			preparedStatement.setInt(2, ratings);
			ResultSet rs = preparedStatement.executeQuery();

			// iterate thru the sresult set
			while (rs.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				// String restaurantName = rs.getString(1);
				// set it
				restaurant.setRestaurantName(rs.getString("restaurant_name"));
				// get the columns from rs and set it in restaurant
				restaurant.setRestaurantId(rs.getInt("restuarant_id")); 
				restaurant.setCity(rs.getString("city"));
				restaurant.setCusine(rs.getString("cusine"));
				restaurant.setType(rs.getString("restuarant_type"));
				restaurant.setCostForTwo(rs.getDouble(6));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add it to a list and return the list
				restaurants.add(restaurant);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (restaurants.isEmpty())
			throw new RestaurantNotFoundException("Restaurant not found");
		return restaurants;
		
	}

	@Override
	public List<Restaurant> findByCity(String city) {
		// TODO Auto-generated method stub
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
//	     get the connection 
		Connection connection = RestaurantConnect.openConnection();
//	     create the PreparedStatement using connection obj
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETQUERYBYCITIES);) {

			preparedStatement.setString(1, city);
			
			ResultSet rs = preparedStatement.executeQuery();

			// iterate thru the sresult set
			while (rs.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				// String restaurantName = rs.getString(1);
				// set it
				restaurant.setRestaurantName(rs.getString("restaurant_name"));
				// get the columns from rs and set it in restaurant
				restaurant.setRestaurantId(rs.getInt("restuarant_id"));
				restaurant.setCity(rs.getString("city"));
				restaurant.setCusine(rs.getString("cusine"));
				restaurant.setType(rs.getString("restuarant_type"));
				restaurant.setCostForTwo(rs.getDouble("cost_for_two"));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add it to a list and return the list
				restaurants.add(restaurant);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (restaurants.isEmpty())
			throw new RestaurantNotFoundException("Restaurant not found");
		return restaurants;
		
	}

}
