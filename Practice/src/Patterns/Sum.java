package Patterns;

public class Sum {
	public int sum(int a,int b) {
		return a+b;
	}
	public int sum(int a,int b,int c) {
		return a+b+c;
	}
	public double sum(double a,double b) {
		return a+b;
	}
	
 public static void main(String[] args) {
	Sum s1=new Sum();
	System.out.println(s1.sum(1.3, 1.4));
	System.out.println(s1.sum(12, 13));
	System.out.println(s1.sum(12, 15,32));
}
}
