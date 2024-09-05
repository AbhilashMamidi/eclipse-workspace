package checkedUnckedException;

public class StackException 
{
  public static void main(String[] args) 
  {
	Stack s=new Stack(5);
	try 
	{
		s.push(12);
		s.push(32);
		s.push(12);
		s.push(32);
		
		
	}
	catch (StackOverFlowException e) 
	{
		
		System.out.println(e);
	}
	
  }
}
