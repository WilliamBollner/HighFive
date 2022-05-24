package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.data.dto.CustomerReviewDTO;
import com.ecommerce.data.model.CustomerReview;
import com.ecommerce.data.model.Product;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.CustomerReviewRepository;

@Service
public class CustomerReviewService {

	@Autowired
	CustomerReviewRepository repository;
	
	public List<CustomerReviewDTO> getAllByProduct(Product product){
		List<CustomerReview> reviews = repository.findByProduct(product);
		List<CustomerReviewDTO> listaReview = new ArrayList<>();
		
		for (CustomerReview review : reviews) {
			listaReview.add(review.getDTO());
		}
		return listaReview;
	}
	
	
	public CustomerReviewDTO getById(Long id) {
		CustomerReview customer = repository.findById(id).orElseThrow(() -> new NotFoundException("CustomerReview not found"));
		return customer.getDTO();
		}
	
	
	public CustomerReviewDTO add(CustomerReviewDTO review) {
		return repository.save(review.getEntity()).getDTO();
	}
	
	public Boolean delete(Long id) {
		repository.delete(getById(id).getEntity());
		return true;
	}
	
	public CustomerReviewDTO update(CustomerReviewDTO review) {
		getById(review.getEntity().getId());
		return add(review);
	}
	
	
	
	

}
