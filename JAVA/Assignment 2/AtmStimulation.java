import java.util.Scanner;
class AtmStimulation
{
     public static void main(String args[])
	 {
	       Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter initial Balance: ");
		   double initialBalance;
		   initialBalance = sc.nextDouble();
		   
		   int choice;
		   
		   do{
			   System.out.println("=======ATM MENU==========");
			   System.out.println("1.Check Balnce");
			   System.out.println("2.Deposit Money");
			   System.out.println("3.Withdrw Money");
			   System.out.println("4.Exit");
			   System.out.println("Enter your choice: ");
			   
			   choice = sc.nextInt();
			   
			   switch(choice)
			   {
				   case 1:
				   {
					   System.out.println("Current Balance: " +initialBalance);
					   break;
				   }
				   case 2:
				   {
					   System.out.println("Enter amount to Deposit: ");
					   double deposit = sc.nextDouble();
					   deposit = initialBalance + deposit;
					   System.out.println("Amount deposited successfully:");
					   break;
				   }
				   case 3:
				   {
					   System.out.println("Enter amount to Withdraw: ");
					   double withdraw = sc.nextDouble();
					   withdraw = initialBalance - withdraw;
					   
					   if(withdraw <= initialBalance)
					   {
						   initialBalance = initialBalance - withdraw;
						  System.out.println("Please collect your cash.");
			
					   }
					   else
					   {
						   System.out.println("Insufficient Balance.");
					   }
					   break;
				   }
				   case 4:
				   {
					   System.out.println("Thank you for using ATM!");
					   break;
				   }
				   
			   }
			  
		   }
		 while (choice != 4);
			   
			   sc.close();   
		   
	 }
}