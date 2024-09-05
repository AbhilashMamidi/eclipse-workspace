package multithreading;

public class ThreadTest 
{
 
public static void main(String[] args) 
  {
	MyThread t=new MyThread();
	t.start();
	t.setDaemon(true); 
	Thread mainThread=Thread.currentThread();
	try
	{
		mainThread.join();
	} catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	System.out.println("Id "+t.getId());
//	System.out.println("Name "+t.getName());
//	System.out.println("Priority "+t.getPriority());
//	t.start();
//	System.out.println("state "+t.getState());
//	System.out.println("Alive "+t.isAlive());
//	System.out.println("__________________");
	
	try 
	{
		Thread.sleep(10);
	} catch (InterruptedException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
