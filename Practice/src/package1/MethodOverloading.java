package package1;
public class MethodOverloading 
{
	static int max(int x,int y)
	{
		if(x>y)
		{
			return x;
		}else
		{
			return y;
		}
	}
	 float max(float x,float y)
	{
		if(x>y)
		{
			return x;
		}else
		{
			return y;
		}
	}
	
  public static void main(String[] args) 
  {
	  MethodOverloading mov=new MethodOverloading();
	  System.out.println(mov.max(5f, 2f));
	  System.out.println(max(3, 5)); 
 }
}
