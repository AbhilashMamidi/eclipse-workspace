package interThreadCommunication;

public class Producer extends Thread
{
	MyData data;
	
   public Producer(MyData d)
   {
		data=d;
   }

   public void run()
   {
	    int count=1;
	    while(true)
	    {
	    	data.set(count);
	    	System.out.println("Producer"+count);
	    	count++;
	    }
	     
   }
   
}
