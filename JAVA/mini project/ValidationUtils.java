import java.util.Map;

public class ValidationUtils{
    //email validation

    public static void validateEmail(String email) throws CustomerException{
		
		if(!email.contains("@") || 
		        !(email.endsWith (".com") || email.endsWith(".org") || email.endsWith(".net"))){
					
					throw new CustomerException("Invalid emailformat");
				}
	}
	
	//Plan & Amount validation
	public static void validatePlanAndAmount(ServicePlan plan, double amount) throws CustomerException {
		
		if(amount != plan.getCharges()){
			throw  new CustomerException("Amount does not matcg selected paln");
		}
	}
	
	//Password validation
	public static void validatePassword(String password) throws CustomerException {
		
		if(password.length() < 6){
			throw new CustomerException("Password must be at least 6 characters") ;
		}
	}
	
	//duplicate email check
	public static void checkDuplicateEmail(String email, Map<String, Customer> customers)
	throws CustomerException{
		if(customers.containsKey(email)){
			throw new CustomerException("Customer already exists with this email");
		}
	}
} 