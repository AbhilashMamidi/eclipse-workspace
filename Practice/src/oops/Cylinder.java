package oops;

public class Cylinder 
{
	public double radius;
	public double height;
	public double lidArea()
	{
		return Math.PI*radius*radius;
		
	}
	public double totalSurfaceArea()
	{
		return 2*lidArea()+circumference()*height;
	
		
	}
	public double circumference()
	{
		return 2*Math.PI*radius;
	
		
	}
	public double volume()
	{
		return lidArea()*height;
		
	}
  public static void main(String[] args)
  {
	Cylinder c1=new Cylinder();
	c1.height=4;
	c1.radius=3;
	System.out.println("cylinder lidArea is :"+c1.lidArea()+"cm");
	System.out.println("cylinder totalSurfaceArea is :"+c1.totalSurfaceArea()+"cm");
	System.out.println("cylinder  circumference is :"+c1.circumference()+"cm");
	System.out.println("cylinder volume is :"+c1.volume()+"cm");
	
  }
}
