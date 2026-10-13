package com.productapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.productapp.model.Product;

public interface IProductRepository extends JpaRepository<Product,Integer> {
	// Auto-generated query by method name
    List<Product> findByPriceLessThan(double price);

    // Auto-generated query by method name
    List<Product> findByProductNameContains(String productName);

    // Custom query using JPQL
    @Query("select p from Product p where p.productName like ?1")
    List<Product> findByName(String productName);
 }
