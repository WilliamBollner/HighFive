package com.ecommerce.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.data.model.CustomerReview;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.CustomerReviewRepository;

public class CustomerReviewController {

	@Autowired
	private CustomerReviewRepository customerReviewRepository;

	@GetMapping("/customerReview")
	public List<CustomerReview> getAllCustomerReview() {		
		return customerReviewRepository.findAll();		
	}

	@PostMapping("/customerReview/{id}")
	public CustomerReview createCustomerReview(@RequestBody CustomerReview customerReview) {		
		return customerReviewRepository.save(customerReview);		
	}

	@GetMapping("/customerReview/{id}")
	public ResponseEntity<CustomerReview> getCustomerReviewById(@PathVariable Long id) {		
		CustomerReview customerReview = customerReviewRepository.findById(id).orElseThrow(() -> new NotFoundException("Não existe produto com id :" + id));
		return ResponseEntity.ok(customerReview);
	}

	@PutMapping("/customerReview/{id}")
	public ResponseEntity<CustomerReview> updateCustomerReview(@PathVariable Long id, @RequestBody CustomerReview customerReviewDetails) {		
		CustomerReview customerReview = customerReviewRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Não existe produto com id :" + id));

		customerReview.setProduto(customerReviewDetails.getProduto());
		customerReview.setQtd(customerReviewDetails.getQtd());		

		CustomerReview updateCustomerReview = customerReviewRepository.save(customerReview);
		return ResponseEntity.ok(updateCustomerReview);		
	}

	@DeleteMapping("/customerReview/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteCustomerReview(@PathVariable Long id) {		
		CustomerReview customerReview = customerReviewRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Não existe valor com id :" + id));

		customerReviewRepository.delete(customerReview );
		Map<String, Boolean> response = new HashMap<>();
		response.put("DELETED", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}	
	
}