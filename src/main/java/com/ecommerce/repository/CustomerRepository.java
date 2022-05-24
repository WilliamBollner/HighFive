package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.data.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
