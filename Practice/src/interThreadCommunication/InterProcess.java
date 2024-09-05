package interThreadCommunication;

public class InterProcess 
{
  public static void main(String[] args) 
  {
	MyData data =new MyData();
	Producer p=new Producer(data);
	Consumer c=new Consumer(data);
	p.start();
	c.start();
  }
}
