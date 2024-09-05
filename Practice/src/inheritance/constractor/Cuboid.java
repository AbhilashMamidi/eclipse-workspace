package inheritance.constractor;

public class Cuboid extends Rectangle
{
	public int height;
	
  public Cuboid()
  {
	  height=1;
  }
  public Cuboid(int h)
  {
	  height=h;
  }
  public double volume()
  {
	  return length*bredth*height;
			  
  }
  public Cuboid(int l,int b,int h)
  {
	super(l,b);
	height=h;
	  
  }
  
}
