package multithreading;

public class MyThread extends Thread 
{
//   public MyThread(String name)
//   {
//	  super(name);
//	  //setPriority(Thread.NORM_PRIORITY+1);
//   }
//   public void run()   
//   {
//	   int count=1;
//	   while(true)
//	   {
//		System.out.println(count++);
//		try
//		{
//			Thread.sleep(100);
//		} catch (InterruptedException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	   }
//   }
	public void run()
	{
		int count=1;
		while(true)
		{
			System.out.println(count++);
			
		}
	}
}
