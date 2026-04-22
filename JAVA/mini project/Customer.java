import java.util.*;
import java.time.LocalDate;

class Customer{
	
	private static int idCounter = 1;
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	
	public Customer(String firstName, String lastName,String email,String password,double registrationAmount, LocalDate dob, ServicePlan plan){
		
		this.customerId = idCounter++;   //auto increment
		this.firstName = firstName;
		this.lastName = lastName;
		this.email  = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
	}
	
    //Getter
	public String getEmail(){
		return email;
	}
	public String getPassword(){
		return password;
	}
	public ServicePlan getPlan(){
		return plan;
	}
	public LocalDate getDob(){
		return dob;
	}
	public String getLastName(){
		return lastName;
	}
	
	//Setter
	
	public void setPassword(String password){
		this.password = password;
	}
	
	//override
	public String toString(){
		
		return "Customer ID: " + customerId +
		       ", Name: " + firstName + " " + lastName +
			   ", Email: " + email +
			   ", Plan: " + plan +
			   ", Amount: " + registrationAmount +
			   ", DOB: " + dob;		   
	}
	
}