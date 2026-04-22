
import java.util.Scanner;
class ElectricityBillCalculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name of the Consumer: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Consumer Number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter number of Units Consumed: ");
		int units = sc.nextInt();
		
		double bill = 0;
		
		if (units <= 100)
		{
			bill = units * 5;
		}
		
		else if(units <= 200)
		{
			bill = units * 7;
		}
		
		else
		{
			bill = units * 10;
		}
		double total = 0;
		if (bill > 1500)
		{
		total = bill + (bill * 0.5);
		}
		
		System.out.println("======== Electricity Bill ========");
		System.out.println("Name of the Consumer: " +name);
		System.out.println("Consumer Number: " +number);
		System.out.println("Consumed units: " +units);
		System.out.println("Bill: " +bill);
		System.out.println("Total bill: " +total);
	}
}