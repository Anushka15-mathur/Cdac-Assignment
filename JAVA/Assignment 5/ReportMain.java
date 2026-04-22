import java.util.*;

class ReportMain{
    public static <T> void generateReport(T[] data){
	      System.out.println("-------Report-------");
		  
		  for(T item : data ){
			  System.out.println(item);
		  }
		  
		  System.out.println("-------------------\n");
	}
	
	public static void main(String args[]){
		
		Double[] sales = {1256.85, 9633.75, 4587.21};
		generateReport(sales);
		
		String[] employees = {"Nitin","Rahul","Raj"};
		generateReport(employees);
		
		Integer[] productIds = {101,102,103};
		generateReport(productIds);
	}

}