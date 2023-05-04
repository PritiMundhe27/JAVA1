package com.app.cust;

import java.time.LocalDate;

public class Customer {
	//customer id(int) ,first name, last name (string),email(string),password(string),
	//registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
	private static int idGenerator;
	private String firstName;
	private String lastname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan serviceplan;;
	private int cutomId;
	
	public Customer(int customId,String firstName,String lastName,String email,String password,double registrationAmount,LocalDate dob,ServicePlan serviceplan) {
		this.cutomId=++idGenerator;
		this.firstName=firstName;
		this.lastname=lastName;
		this.email=email;
		this.password=password;
		this.registrationAmount=registrationAmount;
		this.dob=dob;
		this.serviceplan=serviceplan;
		
	}
	
	public Customer(String email) {
		this.email=email;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastname=" + lastname + ", email=" + email + ", password="
				+ password + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", serviceplan="
				+ serviceplan + ", cutomId=" + cutomId + "]";
	}
	
	public boolean equals(Object o) {
	System.out.println("custom equals");
	if(o instanceof Customer)
		
		return this.email.equals(((Customer)o).email);
		return false;
	}
	
	
	
	
}
