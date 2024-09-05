package synchronization.Atm;

public class ATM
{
 synchronized  public void checkBalance(String name)
  {
	  System.out.println(name+"Checking");
	  
	  try 
	  {
		Thread.sleep(1000);
	  }
	  catch (InterruptedException e) 
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("Balance");
	  
  }
 synchronized public void withDraw(String name,double amount )
  {
	  System.out.println(name+"Wihdrawing");
	  try 
	  {
		Thread.sleep(1000);
	  }
	  catch (InterruptedException e) 
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  System.out.println(amount);
  }
}
