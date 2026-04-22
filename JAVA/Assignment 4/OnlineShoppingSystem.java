import java util.*;

//product class
class Product{
	
	int productId;
	String productName;
	String price;  //user input
	
	Product(int productId, String productName, String price){
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	double getPrice() throws NumberFormatException {
		return Double.parseDouble(price);
	}
}

//Order class
class Order{
	
	String customerName;
	Product[] products;
	
	Order(String customerName, Product[] products){
		this.customerName = customerName;
		this.products = products;
	}
	
	//total calculation without discount
	double calculateTotal(){
		
		double total = 0;
		for(Product p : products){
			total += p.getPrice();
		}
	  return total;	
	}
	
	double calculateTotal(double discountPercent){
		
		double total = calculateTotal();
		return total - (total * discountPercent / 100);
	}
	
	String generationBill(double finalAmount){
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n======BILL=====\n");
		sb.append("Customer: ").append(customerName).append("\n");
		sb.append("\nProducts:\n");
		
		for(Product p : products){
			sb.append(p.productId)
			  .append(" - ")
			  .append(p.productName)
			  .append(" -Rs.")
			  .append(p.price)
			  .append("\n");
		}
		
		sb.append("\nTotal Amount: Rs. ").append(finalAmount);
		ab.append("\n==============\n");
		
		return sb.toString();
	}
}

// Payment interface

interface Payment{
	void pay(double amount);
	void refund(double amount);
}

//upi payment
class UPIPayment implements Payment{
	public void pay(double amount){
		
		System.out.println("Paid Rs. "+ amount + "using UPI");
	}
	
	public void refund(double amount){
		System.out.println("Refund Rs. "+ amount + "via UPI");
	}
} 

//Card payment
class CaedPayment implements Payment{
   public void pay(double amount){
	   System.out.println("Paid Rs. "+amount+ "using Card");
   }
    public void refund(double amount){
		System.out.println("Refunded Rs. "+amount+ "to Card" );
	}   
}

public class OnlineShoppingSystem{
       public static void main(String args[]){
	   
	      Scanner sc = new Scanner(System.in);
		  
		  try{
			  
			  //customer name
			  System.out.println("Enter customer name: ");
			  String name = sc.nextLine();
			  
			  //Product count
			  System.out.println("Enter number of products: ");
			  int n = sc.nextInt();
			  
			  if(n <= 0){
				  throw new Exception("Product count must be greater than 0");
			  }
			  
			  Product[] products = new Product[n];
			  
			  //input products
			  for(int i=0; i < n; i++){
				  System.out.println("\nEnter details for product" +(i + 1));
				  
				  System.out.print("ID: ");
				  int id = sc.nextInt();
				  sc.nextLine(); //consume newline
				  
				  System.out.print("Name: ");
				  String name = sc.nextLine();
				  
				  System.out.print("Price: ");
				  String price = sc.nextLine();
				  
				  products[i] = new Product(id, name, price);
			  }
			 Order order = new Order(cname, products);

			 //Discount 
			 System.out.print("\nEnter discount %: ");
			 double discount = sc.nextDouble();
			 
			 double finalAmount = order.calculateTotal(discount);
			 
			 //payment choice
			 
			 System.out.println("\nChoose Payment Method: ");
			 System.out.println("1. UPI");
			 System.out.println("2. Card");
			 
			 int choice = sc.nextInt();
			 
			 Payment payment;
			 
			 if(choice == 1){
				 payment = new UPIPayment();
			 }
			 else if(choice == 2){
				 payment = new CardPayment();
			 }
			 else{
				 throw new Exception("Invalid payment option");
			 }
			 
			 //Display bill
			 System.out.println(order.generationBill(finalAmount));
			 
			 //Payment
			 payment.pay(finalAmount);
			 
			 System.out.println("Payment Successful: ");
			 
		  }
		  catch(NumberFormatException e){
			  System.out.println("Invalid price format!!");
		  }
		  catch(Exception e){
			  System.out.println(e.getMessage());
		  }
		  
		  sc.close();
	   }

}