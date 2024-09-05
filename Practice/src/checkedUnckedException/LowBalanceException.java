package checkedUnckedException;

public class LowBalanceException extends Exception
{
   public String toString() 
   {
	   return "Balance should not be less than 5000";
   }
	
}

