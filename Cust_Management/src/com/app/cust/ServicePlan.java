package com.app.cust;

public enum ServicePlan {
//	ServicePlan charges : 
//		SILVER : 1000 
//		GOLD : 2000
//		DIAMOND : 5000
//  	PLATINUM : 10000
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	private double planCost;
	ServicePlan(double planCost) {
		this.planCost=planCost;
	}
	public double getPlanCost() {
		return planCost;
	}
	@Override
	public String toString() {
	
		return super.toString();
	}
	
	
	
}
