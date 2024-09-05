package package1;

import java.util.Scanner;

public class GeometricProgression 
{
	  public static void main(String[] args) 
	  {
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter a number");
	     int a=scan.nextInt();
	     System.out.println("Enter r number");
	     int r=scan.nextInt();
	     System.out.println("Enter count number");
	     int n=scan.nextInt();
	     
	     int term=a;
	     for (int i=1;i<=n;i++)
	     { 
	    	 System.out.print(term+",");
	    	 term=term*r;  	 
	     }
      }
}
