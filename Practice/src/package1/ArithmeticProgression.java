package package1;

import java.util.Scanner;

public class ArithmeticProgression 
{
  public static void main(String[] args) 
  {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter a number");
     int a=scan.nextInt();
     System.out.println("Enter d number");
     int d=scan.nextInt();
     System.out.println("Enter count number");
     int n=scan.nextInt();
     
     int term=a;
     for (int i=1;i<=n;i++)
     { 
    	 System.out.println(term+" ");
    	 term=term+d;  	 
     }
  }
}
