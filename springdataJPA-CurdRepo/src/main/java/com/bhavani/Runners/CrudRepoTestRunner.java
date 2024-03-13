package com.bhavani.Runners;

import java.util.List;

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
		// TODO Auto-generated method stub
		// invoke the serive class method
		/*
		 * try { Customer cust =new Customer(); cust.setCno(1); cust.setCname("bhav");
		 * cust.setCadd("hyd"); cust.setBillAmt(900000.0f); String resultMsg
		 * =custService.regiterCustomer(cust); System.out.println(resultMsg); }
		 * catch(Exception e) { e.printStackTrace();
		 * 
		 * }
		 */
		/*
		 * try { boolean flag=custService.isCustomerAvailable(1); if(flag) {
		 * System.out.println("Customer availble"); } else {
		 * System.out.println("Customer not available"); } } catch(Exception e) {
		 * e.printStackTrace(); }
		 */
		/*
		 * try { System.out.println("no of records"+custService.fetchdoctorsCount()); }
		 * catch(Exception e) { e.printStackTrace(); }
		 */
		/*
		 * try { Iterable<Customer> it =custService.showAllCustomers(); it.forEach(doc->
		 * System.out.println(doc)); } catch(Exception e) { e.printStackTrace(); }
		 */
		/*
		 * try { Iterable<Customer> it = custService.showAllCustomersById(List.of(1,2));
		 * it.forEach(cus -> System.out.println(cus)); } catch(Exception e) {
		 * e.printStackTrace(); }
		 */
		/*
		 * try { Customer cust1=new Customer(4,"reddy","vizag",60000.0f); Customer
		 * cust2=new Customer(5,"radha","mitn",50000.0f); Customer cust3=new
		 * Customer(6,"sharu","kadapa",40000.0f); List<Customer> lst =
		 * List.of(cust1,cust2,cust3); String msg =
		 * custService.registerGroupCustomers(lst); System.out.println(msg); }
		 * catch(Exception e) { e.printStackTrace(); }
		 */
		/*
		 * try { Customer cust=new Customer(6,"reddy","vizag",60000.0f);
		 * 
		 * Customer cust = new Customer(); cust.setCno(8); cust.setCname("monireddy");
		 * cust.setCadd("mubi"); cust.setBillAmt(900000.0f);
		 * 
		 * String resultMsg = custService.registerOrUpdateCustomer(cust);
		 * System.out.println(resultMsg); } catch (Exception e) { e.printStackTrace(); }
		 */
		/*
		 * try { String resultMsg = custService.updateCustomerAddress(102, "mitnala");
		 * System.out.println(resultMsg);
		 * 
		 * } catch(Exception e) { e.printStackTrace(); }
		 */
		/*
		 * try { System.out.println(custService.deleteCustomerById(2)); }
		 * catch(Exception e) { e.printStackTrace(); }
		 */
		/*
		 * try { Customer cust=new Customer(); cust.setCno(2); cust.setCname("byre");
		 * cust.setCadd("pune"); cust.setBillAmt(560000.0f);
		 * System.out.println(custService.deleteCustomer(cust));
		 * 
		 * } catch(Exception e) { e.printStackTrace(); }
		 */
		/*
		 * try { String resultMsg=custService.deleteAllCustomers();
		 * System.out.println(resultMsg); } catch(Exception e) { e.printStackTrace(); }
		 */
		try
		{
			System.out.println(custService.deleteCustomerByIds(List.of(1,2)));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
