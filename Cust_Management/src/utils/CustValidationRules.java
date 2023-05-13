package utils;

import java.util.List;

import com.app.cust.Cust;
import com.app.cust.Service_Plan;

import customHandlingException.Cust_Exception;

public class CustValidationRules {

	public static Cust validateAllInputs(int id,String firstName,String lastname,String email,String password,
			double regAmount,String dob,String plan,List<Cust>customers) {
		Service_Plan selectedplan=parseAndValidatePlan(plan);
		
		
		return null;
		//return new Cust();
	}
	
	public static Service_Plan parseAndValidatePlan(String plan) {
		Service_Plan chosenPlan=Service_Plan.valueOf(plan);
		return chosenPlan;
	}
	public static void checkForDuplicate(String newemail,List<Cust>customers) throws Cust_Exception {
		Cust newcustomer=new Cust(newemail);
		if(customers.contains(newcustomer))
			throw new Cust_Exception("customer already exists");
		System.out.println("No duplicate found");
		
		
	}
	
	
	
	
	
	
	
	
	
}
