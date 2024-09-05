package ExceptionHandling;
import java.util.Scanner;
public class Program1 
{
  public static void main(String [] args)
  {
	  Scanner scan=new Scanner(System.in);
	
//	  System.out.println("Enter your name");
	//String name=scan.next();
//	   System.out.println("Enter a  number");
//	   int num=scan.nextInt();
	 for(int i=1;i<=4;i++) {
		for(int k=3;k>=i;k--) {
			System.out.print("  ");
		}
	 
		 for(int j=1;j<=i;j++) {
	           System.out.print(j+" ");
	 }
	 
	 System.out.println();
	
	 }    	
 }
}


