package com.bhavani.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavani.entity.Customer;
import com.bhavani.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo custRepo;
	@Override
	public String regiterCustomer(Customer cust) {
		// TODO Auto-generated method stub
		System.out.println("proxy class name::"+custRepo.getClass()+"..."+Arrays.toString(custRepo.getClass().getInterfaces()));
		
		//save the object 
		Customer cust1=custRepo.save(cust);
		return "customer is saved(record inserted) with id value:"+cust1.getCno();
	}
	@Override
	public boolean isCustomerAvailable(int id) {
		// TODO Auto-generated method stub
				boolean flag=custRepo.existsById(id);
				return flag;
	}
	@Override
	public long fetchdoctorsCount() {
		// TODO Auto-generated method stub
		return custRepo.count();
	}
	@Override
	public Iterable<Customer> showAllCustomers() {
		// TODO Auto-generated method stub
		
		return custRepo.findAll();
	}
	@Override
	public Iterable<Customer> showAllCustomersById(Iterable<Integer> id) {
		// TODO Auto-generated method stub
		
		return custRepo.findAllById(id);
	}
	@Override
	public String registerGroupCustomers(List<Customer> custList) {
		// TODO Auto-generated method stub
		
		Iterable<Customer> savedCustlist = custRepo.saveAll(custList);
		return custList.size()+"no of records insertted";
	}
	@Override
	public String registerOrUpdateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
		//Load object
		
		Optional<Customer> opt = custRepo.findById(cust.getCno());
		if(opt.isPresent())
		{
			custRepo.save(cust);
			return cust.getCno()+"custtomer is updated";
		}
		else
		{
			Customer cust1=custRepo.save(cust);
			return "get customer"+cust1.getCno();
		}
	
	}
	@Override
	public String updateCustomerAddress(int cno, String newAdd) {
		// TODO Auto-generated method stub
		//load customer
		Optional<Customer> opt = custRepo.findById(cno);
		if(opt.isPresent())
		{
			//get customer object from optional object
			Customer cust=opt.get();
			cust.setCadd(newAdd);
			custRepo.save(cust);
			return cno+" customer address is updated";
		}
		return cno+" customer not found for updation";
	}
	@Override
	public String deleteCustomerById(int cno) {
		// TODO Auto-generated method stub
		//load the objects
		Optional<Customer> opt =custRepo.findById(cno);
		if(opt.isPresent())
		{
			custRepo.deleteById(cno);
			return cno+"customer is deleted";
		}
		return cno+"customer is not found for deletiom";
	}
	@Override
	public String deleteCustomer(Customer cust) {
		// TODO Auto-generated method stub
		Optional<Customer> opt = custRepo.findById(cust.getCno());
		if(opt.isPresent())
		{
			custRepo.delete(cust);
			return cust.getCno()+"customer is deleted";
		}
		return cust.getCno()+"customer not found for deletetion";
	
	}
	@Override
	public String deleteAllCustomers() {
		// TODO Auto-generated method stub
		long count = custRepo.count();
		custRepo.deleteAll();
		return count+"no of records are deleted";
	}
	@Override
	public String deleteCustomerByIds(Iterable<Integer> id) {
		// TODO Auto-generated method stub
		List<Customer> lst=(List<Customer>)custRepo.findAllById(id);
		custRepo.deleteAllById(id);
		
	      return lst.size()+"no of records deleted";
	}

}
