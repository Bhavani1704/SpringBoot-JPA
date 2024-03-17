package com.bhavani.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.bhavani.entity.Customer;
import com.bhavani.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo custRepo;

	
	

}
