package threadPractice;

public class myRun implements Runnable
{

	@Override
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+"Hello");
			i++;
		}
		
	}
	public static void main(String[] args) {
		myRun m=new myRun();
		Thread t=new Thread(m);
		t.start();
		int i=1;
		while(true) {
			System.out.println(i+"World");
			i++;
		}
	}
   
}
