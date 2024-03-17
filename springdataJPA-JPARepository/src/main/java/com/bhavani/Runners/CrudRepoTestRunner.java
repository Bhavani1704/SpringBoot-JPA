package com.bhavani.Runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bhavani.entity.Customer;
import com.bhavani.repository.CustomerRepo;


@Component
public class CrudRepoTestRunner implements CommandLineRunner {

	@Autowired
	private CustomerRepo custRepo;

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * List<Customer> custList = custRepo.findByCnameEquals("raj");
		 * custList.forEach(n->System.out.println(n));
		 * 
		 * System.out.println("------------");
		 * 
		 * custRepo.findByCnameIs("suchi").forEach(n->System.out.println(n));
		 * 
		 * System.out.println("----------");
		 * 
		 * custRepo.findByCname("bhav").forEach(n->System.out.println(n));
		 */
		
		/*
		 * System.out.println("---------");
		 * 
		 * custRepo.findByCnameStartingWith("r").forEach(n->System.out.println(n));
		 * 
		 * 
		 * System.out.println("------");
		 * 
		 * custRepo.findByCnameEndingWith("y").forEach(n->System.out.println(n));
		 * 
		 * System.out.println("------");
		 * 
		 * custRepo.findByCnameContaining("a").forEach(n->System.out.println(n));
		 */
		
		/*
		 * System.out.println("---------"); 
		 * custRepo.findBybillAmtBetween(2000.0,
		 * 15000.0).forEach(n->System.out.println(n));
		 */
		
		 System.out.println("---------"); 
			/*
			 * custRepo.findBybillAmtGreaterThanEqualAndbillAmtLessThanEqual(5000.0,
			 * 20000.0).forEach(n->System.out.println(n));
			 * 
			 */
		 custRepo.findByCaddInOrCnameLikeIgnoreCase(List.of("knl","ndl"), "r%").forEach(n->System.out.println(n));
	}
	
}
