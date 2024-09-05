package oops;

public class Rectangle11
{
	public double length;
	public double bredth;
	
	public Rectangle11()
	{
		length=1;
		bredth=1;
	}
	public Rectangle11(double l,double b)
	{
		length=l;
		bredth=b;
	}
	public Rectangle11(double s)
	{
		length=bredth=s;
	}
	public double area()
	{
		return length*bredth;
	}
  public static void main(String[] args) 
  {
	Rectangle11 r1=new Rectangle11();
	System.out.println(r1.area());

	Rectangle11 r2=new Rectangle11(13,5);
	System.out.println(r2.area());

	Rectangle11 r3=new Rectangle11(3);
	System.out.println(r3.area());

	
  }
} 
