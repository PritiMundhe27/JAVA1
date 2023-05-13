package com.app.cust;

import java.time.LocalDate;

public class Cust {
	//customer id(int) ,first name, last name (string),email(string),password(string),
	//registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
	private static int id;
	private String firstName;
	private String lastname;
	private String email;
	private String password;
	private double regAmount;
	private LocalDate dob;
	private Service_Plan plan;
	private int custId;
	public Cust(int custId,String firstName,String lastname,String email,String password,double regAmount,
			LocalDate dob,Service_Plan plan) {
		this.custId=++id;
		this.firstName=firstName;
		this.lastname=lastname;
		this.email=email;
		this.password=password;
		this.regAmount=regAmount;
		this.dob=dob;
		this.plan=plan;
	}
	public Cust(String email) {
		this.email=email;
	}
	@Override
	public String toString() {
		return "Cust [firstName=" + firstName + ", lastname=" + lastname + ", email=" + email + ", password=" + password
				+ ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + ", custId=" + custId + "]";
	}
	public static int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public double getRegAmount() {
		return regAmount;
	}
	public LocalDate getDob() {
		return dob;
	}
	public Service_Plan getPlan() {
		return plan;
	}
	public int getCustId() {
		return custId;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
