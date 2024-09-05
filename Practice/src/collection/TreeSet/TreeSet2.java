package collection.TreeSet;

import java.util.TreeSet;

public class TreeSet2 
{
 public static void main(String[] args) 
 {
	 TreeSet<Point> ts=new TreeSet<>();
	    ts.add(new Point(1, 1));
	    ts.add(new Point(5, 5));
	    ts.add(new Point(5, 2));
	    System.out.println(ts);
}
}
