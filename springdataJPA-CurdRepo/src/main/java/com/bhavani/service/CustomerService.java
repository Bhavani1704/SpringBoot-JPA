package com.bhavani.service;

import java.util.List;

import com.bhavani.entity.Customer;

public interface CustomerService {
	
	public String regiterCustomer(Customer cust);
	public boolean isCustomerAvailable(int id);
	public long fetchdoctorsCount();
	public Iterable<Customer> showAllCustomers();
	public Iterable<Customer> showAllCustomersById(Iterable<Integer> id);
	public String registerGroupCustomers(List<Customer> custList);
	public String registerOrUpdateCustomer(Customer cust);
	public String updateCustomerAddress(int cno,String newAdd);
	public String deleteCustomerById(int cno);
	public String deleteCustomer(Customer cust);
	public String deleteAllCustomers();
	public String deleteCustomerByIds(Iterable<Integer> id);
}
