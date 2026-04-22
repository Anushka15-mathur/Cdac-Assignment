import java.util.*;

//base class
class Payment{
	int paymentId;
	double amount;
	
	Payment(int paymentId, double amount){
		this.paymentId = paymentId;
		this.amount = amount;
	}
	
	void displayPayment(){
		
		System.out.println("Payment ID: " +paymentId);
		System.out.println("Amount: " +amount);
	}
}

//subclass credit card payment 
class CreditCardPayment extends Payment{
	
	String cardNumber;
	
	CreditCardPayment(int paymentId, double amount, String cardNumber){
		super(paymentId, amount);
		this.cardNumber = cardNumber;
	}
	
	void displayPayment(){
		
		System.out.println( "Credit Card Payment");
		System.out.println("Pay Id:" +paymentId);
	    System.out.println("Amount: " +amount);
		System.out.println("Card Number: " +cardNumber);
		System.out.println("------------------");
	}
}

//subclass UPI Payment
class UPIPayment extends Payment{
	
	String upiId;
	UPIPayment(int paymentId,double amount, String upiId){
		super(paymentId,amount);
		this.upiId = upiId;
	}
	
	void displayPayment(){
		System.out.println("UPI Payment");
		System.out.println("Pay Id:" +paymentId);
	    System.out.println("Amount: " +amount);
		System.out.println("UPI Id: " +upiId);
		System.out.println("------------------");
	}
}
class PaymentProcessingMain{
      public static void displayAllPayment(List<? extends Payment> list){
		  for(Payment p : list){
			  p.displayPayment();
		  }
	  }
	  
	  public static void main(String args[]){
		  
		  //array list for card
		  List<CreditCardPayment> cardList = new ArrayList<>();
		  cardList.add(new CreditCardPayment(1, 5000, "1235-6987"));
		  cardList.add(new CreditCardPayment(2, 9000, "9637-4692"));
		  
		  //array list for upi
		  List<UPIPayment> upiList = new ArrayList<>();
		  upiList.add(new UPIPayment(3,6534,"anush@upi"));
		  upiList.add(new UPIPayment(4,9642,"rajkis@upi"));
		  
		  //execution
		  
		  System.out.println("=====Credit Card Payments=====");
		  displayAllPayment(cardList);
		  
		  System.out.println("=====UPI Payments=====");
		  displayAllPayment(upiList);
	  }
}