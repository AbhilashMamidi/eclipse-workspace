package package1;

import java.util.Scanner;

public class AreaOfTriangle 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
//	  System.out.println("Enter base and Height");
//	  float base=scan.nextFloat();
//	  float height=scan.nextFloat();
//	  float area=base*height*0.5f;
//	  System.out.println("Area of Triagle :"+area);
	  
	  System.out.println("Enter a values a,b,c");
	  int a=scan.nextInt();
	  int b=scan.nextInt();
	  int c=scan.nextInt();
	  
	  float s=(a+b+c)/2f;
	  
	  double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	  System.out.println("Area of triangle :"+area);
	  
  }
}
