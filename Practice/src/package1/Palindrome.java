package package1;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		  Scanner scan=new Scanner(System.in);
		   System.out.println("Enter a number");
		   int n=scan.nextInt();
		   
		   int rev=0;
		   int number=n;
		   int r;
		   
		   while(n>0)
		   {
			   r=n%10;
			   rev=rev*10+r;
			   n=n/10;
		   }
		   if(number==rev)
		   {
			   System.out.println("Palindrome ");
		   }
		   else
		   {
			   System.out.println("Not a Palindrome");
		   }
	}
}
	   