package new2024;
import java.util.Scanner;

public class Practice_22july {
  public static void main(String[] args) {
//	  Scanner scan=new Scanner(System.in);
//	  System.out.println("Enter a number")
	  for(int i=1;i<=5;i++) {
		  for(int j=1;j<=5;j++) {
			if(i>=j) {
				System.out.print(" * ");
			}
			else {
				System.out.print("   ");
		
			}
		  }
		  System.out.println(" ");
	  }
  }
}

