package com.bhavani.Runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bhavani.entity.Customer;
import com.bhavani.service.CustomerService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {

	@Autowired
	private CustomerService custService;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * try { String
		 * resultMsg=custService.deleteCustomersbyIdsBatch(List.of(7,8,2,9));
		 * 
		 * System.out.println(resultMsg); } catch(Exception e) { e.printStackTrace(); }
		 */
		/*
		 * try { Customer cust = new Customer(); cust.setCname("raj");
		 * cust.setCadd("ndl"); List<Customer> list =
		 * custService.showCustomersByExampleData(cust, true, "billAmt");
		 * list.forEach(n->System.out.println(n)); } catch(Exception e) {
		 * e.printStackTrace(); }
		 */
		try
		{
			Customer cust = custService.showCustomerById(3);
			System.out.println(cust);
			System.out.println(cust.getBillAmt());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("----------");
		try
		{
			Optional<Customer> opt =custService.fetchCustomerById(20);
			if(opt.isPresent())
			{
				System.out.println("record is::"+opt.get());
			}
			else
			{
				System.out.println("record not found");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
