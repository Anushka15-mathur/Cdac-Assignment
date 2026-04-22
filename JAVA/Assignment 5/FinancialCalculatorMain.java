import java.util.*;

class FinancialCalculatorMain{
      
      public static < T extends Number > void calculate(T[] data){
		  
		  double sum = 0;
		  
		  for(T num : data){
			  
			  sum += num.doubleValue();
		  }
		  
		  double avg = sum/data.length;
		  
		  System.out.println("Sum: "+sum);
		  System.out.println("Average: "+avg);
		  System.out.println("-------------------");
	  }
	  
	  public static void main(String args[]){
		  
		  Integer[] transactions = {100, 200, 300};
		  System.out.println("Transactions: ");
		  calculate(transactions);
		  
		  Double[] salaries = {25000.0, 60000.25,45005.68};
		  System.out.println("Salaries: ");
		  calculate(salaries);
	  }
}