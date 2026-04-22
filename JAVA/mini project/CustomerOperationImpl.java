import java.util.*;

public class CustomerOperationImpl implements CustomerOperation {
	
	private Map<String , Customer> customers = new HashMap<>();
	
	public void signUp(Customer customer) throws CustomerException {
		
		ValidationUtils.checkDuplicateEmail(customer.getEmail(), customers);
		customers.put(customer.getEmail(), customer);
	}
	
	public Customer signIn(String email, String password) throws CustomerException{
		
		Customer customer = customers.get(email);
		
		if(customer == null || !customer.getPassword().equals(password)) {
			
			throw new CustomerException("Invalid email or password");
		}
		
		return customer;
	}
	
	public void changePassword(String email, String oldPassword , String newPassword)
	       throws CustomerException {
			   
			   Customer customer = customers.get(email);
			   
			   if(customer == null || !customer.getPassword().equals(oldPassword)) {
			
			throw new CustomerException("Invalid email or password");
		   }
		   customer.setPassword(newPassword);
    }
	
	public void unsubscribe(String email) throws CustomerException{
	       	
		if(customers.remove(email) == null) {
			
			throw new CustomerException("Customer not found");
		}
	}
	public List<Customer> displayAllCustomers(){
		
		return new ArrayList<>(customers.values());
	}
	
	public void deleteCustomerByPlan(ServicePlan plan) {
		
		customers.values().removeIf(c -> c.getPlan() == plan);
	}
	
	public List<Customer> sortByDob() {
		
		return customers.values().stream()
		          .sorted(Comparator.comparing(Customer::getDob))
				  .toList();
	}
	
	public List<Customer> sortByEmail() {
		
		return customers.values().stream()
		          .sorted(Comparator.comparing(Customer::getEmail))
				  .toList();
	}
	
	public List<Customer> sortByPlanAndLastName() {
		
		return customers.values().stream()
		          .sorted(Comparator.comparing(Customer::getPlan)
				  .thenComparing(Customer::getLastName))
				  .toList();
	}
	
}
   