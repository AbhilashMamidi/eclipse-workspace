package oops;

public class Circle 
{
	public double radius=7;
	public  double area()
	{
		return  Math.PI*radius*radius ;
		
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
		
	}
	public double circumference()
	{
		return perimeter();
		
	}
	
  public static void main(String[] args)
  {
	Circle c1=new Circle();
	c1.radius=5;
	System.out.println("Area of Circle :"+c1.area());
	System.out.println("Area of perimeter :"+c1.perimeter());
	System.out.println("Area of circumference :"+c1.circumference());
	
	Circle c2=new Circle();
	c2.radius=9;
	System.out.println("Area of Circle :"+c2.area());
	System.out.println("Area of perimeter :"+c2.perimeter());
	System.out.println("Area of circumference :"+c2.circumference());
	
  }
  
  
}
