package utils;

import java.util.List;

import com.app.cust.Customer;

import customHandlingException.CustomHandlingException;

public class CustomerValidationRules {
	//add a static method for no duplicate customer hint:public static void checkForDuplicate(email) api:constains
	public static void checkForDuplicate(List<Customer>customerList,String newEmail) throws CustomHandlingException {
		
		Customer newCustomer=new Customer(newEmail);
		if(customerList.contains(newCustomer))
			throw new CustomHandlingException("Duplicate email,please retry");
		System.out.println("No duplicate customer");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
