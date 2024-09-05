package Patterns;
import java.util.Scanner;
public class diamond {
   public static void main(String[] args) {

	          Scanner scan = new Scanner(System.in);
//
//	          System.out.print("Enter the number of rows (odd number): ");
//	          int rows = scanner.nextInt();
//
//	          if (rows % 2 == 0) {
//	              System.out.println("Please enter an odd number of rows.");
//	              return;
//	          }
//
//	          int spaces = rows / 2;
//
//	          // Upper part of the diamond
//	          for (int i = 1; i <= rows; i += 2) {
//	              for (int j = 0; j < spaces; j++) {
//	                  System.out.print(" ");
//	              }
//
//	              for (int j = 0; j < i; j++) {
//	                  System.out.print("*");
//	              }
//
//	              System.out.println();
//	              spaces--;
//	          }
//
//	          // Lower part of the diamond
//	          spaces = 1;
//	          for (int i = rows - 2; i >= 1; i -= 2) {
//	              for (int j = 0; j < spaces; j++) {
//	                  System.out.print(" ");
//	              }
//
//	              for (int j = 0; j < i; j++) {
//	                  System.out.print("*");
//	              }
//
//	              System.out.println();
//	              spaces++;
//	          }
//
//	          scanner.close();
	          
	          
	          System.out.println("Enter a row(odd) number");
	          int row=scan.nextInt();
	          if(row%2==0) {
	        	   System.out.println("Enter a row(odd) number");
	          }
	          int spaces=row/2;
	          
			for(int i=1;i<=row;i+=2) {
	        	  for(int j=0;j<spaces;j++) {
	        		  System.out.print(" ");
	        	  }
	        	  for(int j=0;j<i;j++) {
	        		  System.out.print("*");
	        	  }
	        	  System.out.println();
	        	  spaces--;
	          }
			
			 spaces=1;
			 for(int i=row-2;i>=1;i-=2) {
	        	  for(int j=0;j<spaces;j++) {
	        		  System.out.print(" ");
	        	  }
	        	  for(int j=0;j<i;j++) {
	        		  System.out.print("*");
	        	  }
	        	  System.out.println();
	        	  spaces++;
	          }
		
	         
	          
	      }

 
  
}
