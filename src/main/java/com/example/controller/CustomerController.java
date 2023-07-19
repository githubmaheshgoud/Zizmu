package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.CustomerDetails;
import com.example.service.CustomerServiceInterface;

@Controller
@RequestMapping({ "/employee", "/" })
public class CustomerController {
	 
	@Autowired
	private CustomerServiceInterface service;
	
	@PostMapping("/save")
	public String saveForm(@RequestBody @Valid CustomerDetails customerDetails) {
		String id = service.save(customerDetails);
		return "Register";
	}
   
}
