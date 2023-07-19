package com.example.service;

import java.util.List;

import com.example.model.CustomerDetails;

public interface CustomerServiceInterface {
	
	public List<CustomerDetails> getAllData();

	public String save(CustomerDetails cd);
}
