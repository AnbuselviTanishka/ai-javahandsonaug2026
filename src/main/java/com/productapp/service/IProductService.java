package com.productapp.service;

import java.util.List;

import com.productapp.dto.ProductDto;
import com.productapp.exception.ProductNotFoundException;

public interface IProductService {
void addProduct(ProductDto ProductDto);
void updateProduct(ProductDto ProductDto);
void deleteProduct(int productId);
ProductDto getById(int productId) throws ProductNotFoundException;

List<ProductDto> getAllProducts();
List<ProductDto> getByLesserPrice(double price);
List<ProductDto> getByProductNameContains(String productName) throws ProductNotFoundException;

List<String> getByNameHaving(String productName);
}
