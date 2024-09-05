package package1;

import java.util.Iterator;
import java.util.Scanner;

public class ForLoop1 
{
 public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a  number");
	int n=scan.nextInt();
	
//	for (int i=1;i<=10;i++)
//	{
//		System.out.println(n +"x"+i+"="+n*i);
//	}
//	int sum=0;
//	
//	for (int i = 1;i<=n;i++)
//	{
//	 sum=sum+i; 	
//	}
//	
//	if(sum%2==0)
//	{
//		System.out.println(sum);
//	}
	
//	int fact=1;
//	for (int i=1;i<=n;i++)
//	{
//		fact=fact*i;
//	}
//	System.out.println(fact);
	
//	int r;
//	while(n>0)
//	{
//		r=n%10;
//		n=n/10;
//		System.out.println(r);
//	}
//	System.out.println(n);
//		
	
	int count=0;
    while(n>0)
    {
    	n=n/10;
    	count++;
    }
    System.out.println(count);
	
	
  }
}
























