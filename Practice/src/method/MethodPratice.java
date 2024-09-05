package method;

public class MethodPratice 
{
	
	static int max(int x,int y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
   public static void main(String[] args) 
   {
	  int a=10;
	  int b=15;
	  //System.out.println(max(a,b));
	  MethodPratice mp=new MethodPratice();
	  System.out.println(mp.max(a, b));
   }
}
