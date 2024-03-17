package com.bhavani.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bhavani.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{
	
	public List<Customer> findByCnameEquals(String name);
	public List<Customer> findByCnameIs(String name);
	public List<Customer> findByCname(String name);
	public List<Customer> findByCnameStartingWith(String lastChars);
	public List<Customer> findByCnameEndingWith(String lastChars);
	public List<Customer> findByCnameContaining(String chars);
	public List<Customer> findBybillAmtBetween(double start,double end);
	
	//having multiple conditions
	
	//public List<Customer> findBybillAmtGreaterThanEqualAndbillAmtLessThanEqual(double min,double max);
	public List<Customer> findByCaddInOrCnameLikeIgnoreCase(List<String> addresses,String namePattern);
	
}
