package inheritance;

public class Cylinder extends Circle
{
  public double height;
  public double volume()
  {
	return Math.PI*radius*radius*height;
	  
  }
  
  
}
