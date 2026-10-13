package com.productapp.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.productapp.dto.ProductDto;
import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {


private final IProductRepository productRepository;
private final ModelMapper mapper;

@Override
public void addProduct(ProductDto ProductDto) {
	// TODO Auto-generated method stub
	Product product=mapper.map(ProductDto, Product.class);
	productRepository.save(product);
	
}

@Override
public void updateProduct(ProductDto ProductDto) {
	// TODO Auto-generated method stub
	Product product=mapper.map(ProductDto, Product.class);
	productRepository.save(product);
}

@Override
public void deleteProduct(int productId) {
	// TODO Auto-generated method stub

	productRepository.deleteById(productId);
	
}

@Override
public ProductDto getById(int productId) throws ProductNotFoundException {
	// TODO Auto-generated method stub
	Product product= productRepository.findById(productId)
			.orElseThrow(() -> new ProductNotFoundException("Invalid product id"));
			return mapper.map(product, ProductDto.class);
}

@Override
public List<ProductDto> getAllProducts() {
	// TODO Auto-generated method stub
	List<Product> products=productRepository.findAll();
return products.stream()
		.map(product->mapper.map(product, ProductDto.class))
		.toList();
}

@Override
public List<ProductDto> getByLesserPrice(double price) {
	// TODO Auto-generated method stub
	List<Product> products = productRepository.findByPriceLessThan(price);
    // convert list of products to list of DTOs
    return products.stream()
        .map(product -> mapper.map(product, ProductDto.class))
        .sorted(Comparator.comparing(ProductDto::getProductName))
        .toList();
}

@Override
public List<ProductDto> getByProductNameContains(String productName) throws ProductNotFoundException {
	 List<Product> products = productRepository.findByName("%" + productName + "%");
	    return products.stream()
	            .map(product -> mapper.map(product, ProductDto.class))
	            .sorted(Comparator.comparing(ProductDto::getProductName))
	            .toList();
}

@Override
public List<String> getByNameHaving(String productName) {
	// using custom query
   return null;
}


	

	
}
