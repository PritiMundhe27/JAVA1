package com.app.cust;

public enum Service_Plan {
////ServicePlan charges : 
//	SILVER : 1000 
//	GOLD : 2000
//	DIAMOND : 5000
//	PLATINUM : 10000
	
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double plancost;
	private Service_Plan(double plancost) {
		this.plancost=plancost;
	}
	public double getPlancost() {
		return plancost;
	}
	
	
	
	
	
	
	
	
	
}

