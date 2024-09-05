package Patterns;

public class pattern2 {
	 public static void printPattern(int n)
	    {
	        for (int i = 1; i <= n; i++) {
	            // inner loop to print space
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // inner loop to print star
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	    }
	    public static void main(String args[])
	    {
	        int n = 6;
	        printPattern(n);
	    }

}
