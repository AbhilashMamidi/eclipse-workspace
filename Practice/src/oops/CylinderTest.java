package oops;

public class CylinderTest
{
	private double length;
	private double height;	
	
	
  public double getLength()
  {
		return length;
	}


	public void setLength(double length) 
	{
		this.length = length;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	

public CylinderTest() {
		super();
	
	}


    public CylinderTest(double length, double height) 
    {
	super();
	this.length = length;
	this.height = height;
    }
    public double area()
    {
    	return length*height;
    }


public static void main(String[] args) 
  {
	  CylinderTest c=new CylinderTest();
	  c.setHeight(14);
	  c.setLength(4);
	  System.out.println(c.area());
  }
}
