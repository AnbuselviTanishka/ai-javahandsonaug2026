package com.productapp.service;

import com.productapp.model.Product;

public interface IProductService {

	Product[] getAllProduct();
	Product getProductID(int productId);
	Product[] getByBrand(String brand);
}
