package interThreadCommunication2;

import java.util.concurrent.CountDownLatch;

import interThreadCommunication.Consumer;

public class WhiteBoard 
{
  String text;
  int numberOfStudents=0;
  int count=0;
   public void attendence() 
   {
	   numberOfStudents++;
   }
  synchronized  public void  write(String t)
  {
	  System.out.println("Teacher is Writing "+t);
      while(count!=0)
      {
    	  try
    	  {
			wait();
		  } 
    	  catch (InterruptedException e)
    	  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
      }
	  text=t;
	  count=numberOfStudents;
	  notifyAll();
  }
  synchronized public String read()
  {
	  while(count==0)
	  {
		   try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  String t=text;
		  count--;
		  if(count==0)
		  {
			  notify();
		  }
	  
	  }
	return text ;
	  
  }
  
}
 