package package1;

public class AreaOfCircle 
{
	
  public static double area(double radius)
  {
	 return  Math.PI*radius*radius;
  }
  public static double area(double length,double breadth)
  {
	 return  length*breadth;
  }
  public static void main(String[] args)
  {
	System.out.println("Area of circle :"+area(5));
	System.out.println("Area of Rectangle :"+area(5, 10));
  } 
}
	