import java.util.Scanner;
class StudentResultProcessingSystem
{
	public static void main(String args[])
	{
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the name of Student: ");
	String name = sc.nextLine();
	
	System.out.println("Enter the Roll No: ");
	int rollNo = sc.nextInt();
	
	System.out.println("Enter marks of 5 Subject: ");
	int m1 = sc.nextInt();
	int m2 = sc.nextInt();
	int m3 = sc.nextInt();
	int m4 = sc.nextInt();
	int m5 = sc.nextInt();
	
	int total = (m1 + m2 + m3 + m4 + m5);
	double average = total/5.0;
	double percentage = total/5;
	
	char grade;
	
	if(percentage >= 90)
	{
	    grade = 'A';
	}
	else if(percentage >= 75)
	{
		grade = 'B';
	}
	else if(percentage >= 60)
	{
		grade = 'C';
	}
	else if(percentage >= 40)
	{
		grade = 'D';
	}
	else 
	{
		grade = 'F';
	}
	
	String result;
	if(percentage >= 40)
	{
		result = "Student is promoted.";
	}
	else 
	{
		result = "Student is not promoted.";
	}
	
	System.out.println("=========Student Result==========");
	System.out.println("Name of Student: " +name);
	System.out.println("Roll Number of Student: " +rollNo);
	System.out.println("Total Marks: " +total);
	System.out.println("Average Marks: " +average);
	System.out.println("Percenatge: " +percentage);
	System.out.println("Grade: " +grade);
	System.out.println("Result: " +result);
	}
}	