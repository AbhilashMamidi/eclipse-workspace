package interThreadCommunication;

public class MyData 
{
  int value=0;
  boolean flag=true;
   synchronized public void set(int v)
  {
	 while(flag!=true)
	 {
		 try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	  value=v;
	  flag=false;
	  notify();
  }
   synchronized public int get()
  {
	  int x=0;
	  while(flag!=false)
		 {
			 try
			 {
				wait();
		   	} catch (InterruptedException e)
			 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	  x=value;
	  flag=true;
	  notify();
	  return x;
	  
  }
}
