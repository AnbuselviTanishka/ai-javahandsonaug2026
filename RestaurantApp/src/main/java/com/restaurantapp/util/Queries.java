package com.restaurantapp.util;

public class Queries {
public static final String INSERTQUERY=
"insert into restaurant (restaurant_name, city, cusine,restuarant_type, cost_for_two, opening_time, closing_time, ratings)values (?,?,?,?,?,?,?,?)";
public static final String UPDATEQUERY=
"update restaurant set cost_for_two=? where restuarant_id=? ";
public static final String GETALLQUERY="select * from restaurant";
public static final String GETQUERYBYID="select * from restaurant where restuarant_id=?";
public static final String GETQUERYBYCUSINECOST="select * from restaurant where cusine=? and cost_for_two<?";
public static final String GETQUERYBYTYPELESSERCOST="select * from restaurant where restuarant_type=? and cost_for_two<?";
public static final String GETQUERYBYCTYPERATINGS="select * from restaurant where restuarant_type=? and  ratings<?  ";
public static final String GETQUERYBYCITIES="select * from restaurant where city=?";
public static final String GETQUERYBYTIME="select * from restaurant where opening_time=?";
public static final String DELETEQUERY="delete from restaurant where restuarant_id=?";
}