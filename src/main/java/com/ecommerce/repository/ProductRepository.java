package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.data.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
