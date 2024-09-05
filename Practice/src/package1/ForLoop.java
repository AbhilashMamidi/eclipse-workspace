package package1;

public class ForLoop 
{
  public static void main(String[] args) 
  {
	int A[]= {1,3,5,7,9};
	/*
	for(int i=0;i<A.length;i++) 
	{
		System.out.println(A[i]);
	}
	*/
	System.out.println("Length of array is "+A.length);
	for (int i=A.length-1;i>=0;i--)
	{
		System.out.println(A[i]);
	}
	
	int sum=0;
	for (int i=0;i<A.length;i++)
	{
		sum=sum+A[i];
	}
	System.out.println(sum);
	
	for(int i=0;i<A.length;i++)
	{
		if(A[i]==5)
		{
			System.out.println("Element is present ="+A[i]);
			System.exit(0);
		}
	}
	System.out.println("Element is not present");
  }
}
