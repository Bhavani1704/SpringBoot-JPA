package com.bhavani.service;

import java.util.List;
import java.util.Optional;

import com.bhavani.entity.Customer;

public interface CustomerService {
	
	public String deleteCustomersbyIdsBatch(List<Integer> ids);
	public List<Customer> showCustomersByExampleData(Customer cust,boolean flagOrder,String... properties);
	public Customer showCustomerById(int cno);
	public Optional<Customer> fetchCustomerById(int cno);
}
