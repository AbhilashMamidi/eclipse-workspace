package package1;

public class MaximumElement 
{
  public static void main(String[] args) 
  {
	int A[] = {2,4,6,8,24,25,27,5,7};
	int max2=A[0];
	int max1=A[0];
	for (int i=1;i<A.length;i++)
	{
		if(A[i]>max1)
		{
			max2=max1;
			max1=A[i];
		}
		else if(A[i]>max2)
		{
			max2=A[i];
		}
	}
	System.out.println(max2);
			
  }
}
