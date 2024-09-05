package synchronization.Atm;

public class Customer extends Thread
{
	String name;
    ATM atm;
    double amount;
   Customer(String n,ATM a,double amt) 
  {
	 name=n;
	 atm=a;
	 amount=amt;
  }
   public void  useATM()
   {
	   atm.checkBalance(name);
	   atm.withDraw(name, amount);
   }
   public void run()
   {
	   useATM();
   }
}
