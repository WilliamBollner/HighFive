package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.data.dto.CustomerDTO;
import com.ecommerce.data.model.Customer;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;
	
	public CustomerDTO getById(Long id){
		Customer customer = repository.findById(id).orElseThrow(() -> new NotFoundException("Customer " + id + " not found")); 
		return customer.getDTO();
	}
	
	public CustomerDTO save(CustomerDTO customerDTO) {
		Customer customer = repository.save(customerDTO.getEntity());
		return customer.getDTO();
	}

}
