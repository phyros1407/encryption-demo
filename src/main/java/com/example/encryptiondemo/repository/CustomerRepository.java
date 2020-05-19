package com.example.encryptiondemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.encryptiondemo.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>
{
	//public void insertCustomer(Customer customer);
}
