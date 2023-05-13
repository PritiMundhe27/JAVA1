package utils;

import java.util.ArrayList;
import java.util.List;
import static utils.CustValidationRules.*;
import com.app.cust.Cust;

public class CustUtils {

	public static List<Cust>populatedList(){
		
		try {
			List<Cust>customers=new ArrayList<Cust>();
			customers.add(validateAllInputs(1, "s", "m", "sm@gmail", "123123", 5000, "2000-01-01", "silver",customers));
			
			
			
			return customers;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}
	
	
	
	
	
	
	
}
