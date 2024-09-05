package collection;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet1 
{
  public static void main(String[] args) 
  {
	 TreeSet<Integer> ts=new TreeSet<Integer>(List.of(10,30,50,70,10,40));
	 Collection<Integer> c=new TreeSet<Integer>();
	 SortedSet<Integer> s=new TreeSet<Integer>();
	 ts.add(12);
	
	 System.out.println(ts);
  }
}
