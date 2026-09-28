package com.restaurantapp.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class RestaurantConnect {
static Connection connection;
public static Connection openConnection()
{
	
String url="jdbc:mysql://localhost:3306/restaurantdb";
String username="root";
String password="Ohmmurugan@07102008";
try
{
	connection=DriverManager.getConnection(url,username,password);
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return connection;
}
public static void closeConnection()
{
	try
	{
	if(connection!=null)
	{
		connection.close();
	}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	
}
}
