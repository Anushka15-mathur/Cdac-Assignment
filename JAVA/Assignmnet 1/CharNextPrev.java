import java.util.Scanner;

class CharNextPrev
{ 
     public static void main(String args[])
         {

           Scanner sc = new Scanner(System.in);

           System.out.println("Enter a character: ");
           char ch = sc.next().charAt(0);

           char next = (char)(ch + 1);
           char prev = (char)(ch - 1);

           System.out.println("Next Character: "+next);
 
           System.out.println("Previous Character: "+prev);   
         }
}
