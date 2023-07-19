package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.CustomerDetails;
import com.example.repository.CustomerRepository;

@Service
public class CustomerService implements CustomerServiceInterface {

	@Autowired
	private CustomerRepository repo;

	public String save(CustomerDetails cd) {

		CustomerDetails store = repo.save(cd);
		if (store.getId() != null) {
			return "Customer data saved";
		} else {
			return "Customer data is not saved";
		}
	}
	public List<CustomerDetails> getAllData() {
		return repo.findAll();
	}

	/*
	 * public List<CustomerDetails> getAllData() { List<CustomerDetails> get =
	 * repo.findAll(); return get; }
	 * 
	 * public Optional<CustomerDetails> getOneData(Integer id) {
	 * if(repo.existsById(id)) { Optional<CustomerDetails> get = repo.findById(id);
	 * return get; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public String update(CustomerDetails id) { if(id.getId()!= null &&
	 * repo.existsById(id.getId())) { repo.save(id); return
	 * "updated cutsomer details"; }else
	 * 
	 * return "Customer data not found"; }
	 * 
	 * 
	 * public void delete(Integer id) { repo.deleteById(id);
	 * 
	 * }
	 */

}
