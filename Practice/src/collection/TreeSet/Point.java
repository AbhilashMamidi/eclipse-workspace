package collection.TreeSet;

public class Point implements Comparable

{
  int x;
  int y;
public Point(int x, int y)
{
	super();
	this.x = x;
	this.y = y;
}
@Override
public String toString()
{
	return "Point [x=" + x + ", y=" + y + "]";
}
@Override
public int compareTo(Object o)
{
	Point p=(Point)o;
	if(this.x<p.x)
	{
		return -1;
	}
	else if(this.x>p.x)
	{
		return 1;
	}
	else
	{
		if(this.y<p.y)
		{
			return -1;
		}
		else if(this.y>p.y)
		{
			return 1;
		}
	}
	return 0;
}

  
  
}
 