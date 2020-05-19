package com.example.encryptiondemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.encryptiondemo.model.Customer;
import com.example.encryptiondemo.repository.CustomerRepository;

@Service
public class CustomerService
{
	@Autowired
    private CustomerRepository repository;
	
	public void saveCustomer(Customer customer)
	{
		repository.save(customer);
    }
	
	public List<Customer> getCustomers()
	{
		Iterable<Customer> iterable = repository.findAll();
		List<Customer> customers = new ArrayList<Customer>();
		
		iterable.forEach(customers::add);
		
		return customers;
    }
	
	public Customer getCustomer(Integer custId)
	{
		Customer customer;
		
		Optional<Customer> custOptional = repository.findById(custId);
		
		if(custOptional.isPresent())
			customer = custOptional.get();
		else
			customer = new Customer();
		
		return customer;
    }

	public void updateCustomer(Integer custId, Customer customer)
	{	
		Optional<Customer> custOptional = repository.findById(custId);
		
		if (custOptional.isPresent())
		{
			customer.setId(custId);
			repository.save(customer);
		}
	}

	public void deleteCustomer(Integer custId)
	{
		Optional<Customer> custOptional = repository.findById(custId);
		
		if (custOptional.isPresent())
			repository.deleteById(custId);
	}
}
