package synchronization;

public class SyncDemo
{

	public static void main(String[] args) 
	{
       MyData data=new MyData();
       MyThread1 t1=new MyThread1(data);
       MyThread2 t2=new MyThread2(data);
       t1.start();
       t2.start();
       
       
       
	}

}
