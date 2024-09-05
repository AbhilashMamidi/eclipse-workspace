package method;

public class Reverse 
{
	public  int reverse(int n)	
	{
		int rev=0;
		
		while(n>0)
		{
			rev=rev*10+n%10;
			n=n/10;		
		}
		return rev;
		
	}
	public int [] reverse(int A[]) 
	{
		int B[]=new int [A.length];
		
		for(int i=A.length-1,j=0;i>0;i--,j++)
		{
			B[j]=A[i];
		}
		return B;
	}
	boolean validate(String name)
	{
		return name.matches("[a-zA-z\\s]+");
	}
	boolean validate(int age)
	{
		return age>3&&age<=15;
	}
	
  public static void main(String[] args) 
  {
	  Reverse r=new Reverse();
	  System.out.println(r.reverse(12));
	  System.out.println(r.reverse(1234));
	  System.out.println(r.validate(12));
	  System.out.println(r.validate("a"));
  } 
  
}
