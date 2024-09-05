package recursion;

public class Recursion 
{
  public static void fun1(int n)
  {
	  if(n>0)
	  {
		  
		  System.out.print("fun1 recursion values are:"+n+" ");
		  fun1(n-1);
		
	  }
	  System.out.println("");
	
  }
  public static void fun2(int m)
  {
	  if(m>0)
	  {
		  fun2(m-1);
		  System.out.print("fun2 recursion values are :"+m+" ");	
		  System.out.println("");
	  }
	 
	
  }
  
	
  public static void main(String[] args) 
   {
	fun1(3);
	fun2(3);
   }
}
