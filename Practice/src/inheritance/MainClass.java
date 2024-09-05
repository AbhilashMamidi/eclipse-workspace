package inheritance;

public class MainClass 
{
  public static void main(String[] args)
  {
	Cylinder c=new Cylinder();
	c.radius=6;
	c.height=8;
	System.out.println("Area is :"+c.area());
	System.out.println("perimeter is :"+c.perimeter());
	System.out.println("Volume is :"+c.volume());
	System.out.println("Circumference is :"+c.circumference());
  }
}
