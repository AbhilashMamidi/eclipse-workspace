package method;

public class MethodPratice2 
{
	public static void update(int A [])
	{
		A[0]=25;
	}

   public static void main(String[] args) 
   {
	  int A[]= {2,4,6,8};
	  update(A);
	  System.out.println(A[0]);
   }
}
