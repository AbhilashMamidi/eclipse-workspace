package package1;

import java.util.Scanner;

public class ArmStrongNumber 
{
  public static void main(String[] args)
  {
	//sum of cube of digits is called Armstrong number
	    Scanner scan=new Scanner(System.in);
		System.out.println("Enter a  number");
		int n=scan.nextInt();
	    int sum=0;
	    int r;
	    int number=n;
	    while(n>0)
	    {
	    	r=n%10;
	    	sum=sum+r*r*r;
	    	n=n/10;
	    }
	    number=n;
	    if(n==number)
	    {
	    	System.out.println("Armstrong number");
	    }
	    else
	    {
	    	System.out.println("Not a Armstrong number");
	    }
	  
  }
  
}
