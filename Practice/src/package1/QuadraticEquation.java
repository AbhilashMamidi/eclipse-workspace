package package1;

import java.util.Scanner;

public class QuadraticEquation 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter values of a,b,c");
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	
	double r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
	double r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
	
	System.out.println("roots are r1 is: "+r1 +" r2 is : "+r2 );
  }
}
