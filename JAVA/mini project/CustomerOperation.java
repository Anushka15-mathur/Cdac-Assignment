import java.util.List;

public interface CustomerOperation{

    void signUp(Customer customer) throws CustomerException;
	
	Customer signIn(String email, String password) throws CustomerException;
	
	void changePassword(String email, String oldPassword, String newPassword)
	    throws CustomerException;
		
	void unsubscribe(String email) throws CustomerException;

List<Customer> displayAllCustomers();
void deleteCustomerByPlan(ServicePlan plan);

List<Customer> sortByDob();

List<Customer> sortByEmail();

List<Customer> sortByPlanAndLastName();	
}