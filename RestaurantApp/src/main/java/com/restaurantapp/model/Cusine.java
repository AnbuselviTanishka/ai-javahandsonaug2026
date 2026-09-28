package com.restaurantapp.model;

public enum Cusine {

	SI("SOUTH INDIAN"), NI("NORTH INDIAN"), IT("ITALIAN"), CH("CHINESE"), CO("CONTINENTAL");

	private String cusineType;

	Cusine(String cusineType) {
		this.cusineType = cusineType;
	}

	public String getCusineType() {
		return cusineType;
	}

}
