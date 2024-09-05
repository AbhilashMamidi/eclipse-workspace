package interThreadCommunication;

public class Consumer extends Thread
{
	MyData data;
	
	   public Consumer(MyData d)
	   {
			data=d;
	   }

	   public void run()
	   {
		    int value; 
		    while(true)
		    {
		    	value=data.get();
		       System.out.println("Consumer"+value);
		    }
		     
	   }
}
