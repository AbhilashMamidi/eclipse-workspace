package synchronization;

public class MyThread1 extends Thread
{
  MyData d;
  public MyThread1(MyData d) 
  {
	this.d=d;
  }
  public void run()
  {
	  d.display("Hello World");
  }
  
}
