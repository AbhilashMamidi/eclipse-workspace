package package1;

public class RotatingElement 
{
  public static void main(String[] args)
  {
	int A []= {1,3,4,6,7,9,11,13,15,16,17};
	
	for(int x:A)
	
		System.out.print(x+",");
		System.out.println(" ");
	
	
	int temp=A[0];
	for (int i=1;i<A.length;i++)
	{
		A[i-1]=A[i];
	}
	 A[A.length-1]=temp;
	 
	   for(int x:A)
		
			System.out.print(x+",");
			System.out.println("");
		
	 
	
	
	
  } 
  
}
