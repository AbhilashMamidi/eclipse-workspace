package synchronization.Atm;

public class SCThread1 {

	public static void main(String[] args)
	{
	  ATM atm=new ATM();
	  Customer c1=new Customer("Abhi", atm, 1000);
	  Customer c2=new Customer("Ram", atm, 2000);
	  c1.start();
	  c2.start();
	}

}
