package package1;

public class VariableArgument 
{
	//When we use  variable argument method we can pass any kind of values Array Also

  	public static void show(int ...A)
  	{
		for(int x:A)
		{
			System.out.println(x);
		}
  		
  	}
  	public static void showlist(int start,String ...s)
  	{
  		for(int i=0;i<s.length;i++)
  		{
  			System.out.println(start+")"+s[i]); 
  			start++;
  		}
  	}
   public static void main(String[] args) 
  {
	show();
	show(12,21,12,13,23);
	show(new int [] {11,21,31,41});
	
	showlist(5,"Abhi","A","asd","fd","fsd");
  }
}
	 