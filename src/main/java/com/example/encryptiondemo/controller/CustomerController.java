package com.example.encryptiondemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.encryptiondemo.model.Customer;
import com.example.encryptiondemo.service.CustomerService;

@RestController
@RequestMapping(value="v1/customer")
public class CustomerController
{
	@Autowired
    private CustomerService service;
	
	@PostMapping(path = "")
    public void saveCustomer(@RequestBody Customer customer)
	{
		service.saveCustomer(customer);
    }
	
	@GetMapping(path = "")
    public List<Customer> getCustomers()
	{
        return service.getCustomers();
    }
	
	@GetMapping(path = "/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") Integer custId)
	{
        return service.getCustomer(custId);
    }
	
	@PutMapping(path = "/{customerId}")
    public void updateCustomer(@PathVariable("customerId") Integer custId, @RequestBody Customer customer)
	{
		service.updateCustomer(custId, customer);
    }
	
	@DeleteMapping(path="/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer custId)
	{
		service.deleteCustomer(custId);
    }
}
