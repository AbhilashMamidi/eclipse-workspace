package package1;

public class RotatingRight
{
  public static void main(String[] args) 
  {
	  int A []= {1,3,4,6,7,9,11,13,15,16,17};
		
		for(int x:A)
		
			System.out.print(x+",");
			System.out.println(" ");
			
		int temp=A[A.length-1];
		for(int i=A.length;i>=0;i--)
		{
			A[i+1]=A[i];			
		}
		A[0]=temp;
		for(int x:A)
			
			System.out.print(x+",");
			System.out.println(" ");
  } 
}
