package ExceptionHandling;

public class Program2 
{
 public static void main(String[] args)
 {
	try
	{
		 int A[]= {30,10,20,12,13};
		 int r=A[0]/A[1];
		 System.out.println(r);
		 try
		 {
			 System.out.println(A[5]);
		 }
		 catch (ArrayIndexOutOfBoundsException aiobe) 
			{
				System.out.println(aiobe);
			}
	}
	catch (ArithmeticException ae) 
	{
		System.out.println(ae);
	}
	
	 
}
}
