package synchronization;

public class MyData 
{
	// Method-2 Type of synchronization
   synchronized public void display(String str)
  {
	 // Method-1 Type of synchronization
//	 synchronized (this) 
//	 {
//		 for (int i = 0; i < str.length(); i++)
//		  {
//			System.out.print(str.charAt(i));
//		  }
//		 System.out.println("");
//	 }
	  
	  

		 for (int i = 0; i < str.length(); i++)
		  {
			System.out.print(str.charAt(i));
			try
			{
				Thread.sleep(100);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
		 System.out.println("");

  }
  
  
}
