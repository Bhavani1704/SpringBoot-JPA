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

	@Override
	public String deleteCustomersbyIdsBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		List<Customer> lst =custRepo.findAllById(ids);
		
		custRepo.deleteAllByIdInBatch(ids);
		return lst.size()+"no of custimers deleted in batch";
	}

	@Override
	public List<Customer> showCustomersByExampleData(Customer cust, boolean flagOrder, String... properties) {
		// TODO Auto-generated method stub
		Sort sort =Sort.by(flagOrder?Direction.ASC:Direction.DESC,properties);
		Example<Customer> example = Example.of(cust);
		List<Customer> list = custRepo.findAll(example,sort);
		return list;
	}

	@Override
	public Customer showCustomerById(int cno) {
		// TODO Auto-generated method stub
		Customer cust =custRepo.getReferenceById(cno);
		System.out.println(cust.getClass()+".."+cust.getClass().getSuperclass());
		
		return cust;
	}

	@Override
	public Optional<Customer> fetchCustomerById(int cno) {
		// TODO Auto-generated method stub
		
		Optional<Customer> opt = custRepo.findById(cno);
		return opt;
	}
	

}
