package com.bhavani.repository;

import org.springframework.data.repository.CrudRepository;

import com.bhavani.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
