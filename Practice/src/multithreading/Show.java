package multithreading;

public class Show implements Runnable
{
	public void run() 
	{
		int i=1;
		while(true)
		{
			System.out.println(i+")"+"Hello");
			i++;
		}
	}
  public static void main(String[] args) 
  {
	Show s=new Show();
    Thread t =new Thread(s);
    t.start();
    int i=1;
	while(true)
	{
		System.out.println(i+")"+"World");
		i++;
	}
  }
}
