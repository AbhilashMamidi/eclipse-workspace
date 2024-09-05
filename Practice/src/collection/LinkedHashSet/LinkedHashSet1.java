package collection.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 
{
  public static void main(String[] args)
  {
	  
	  //key value pair is called Entry
	  LinkedHashSet<String> lhs=new LinkedHashSet<>();
	  lhs.add("A");
	  lhs.add("I");
	  lhs.add("O");
	  lhs.add("U");
	  lhs.add("B");
	  lhs.forEach(System.out::print);
	  
	  System.out.println("_______________________");
	  
	  //In HashSet Sorted order values will be printed
	  HashSet<String> hs=new HashSet<String>();
	  hs.add("A");
	  hs.add("E");
	  hs.add("I");
	  hs.add("O");
	  hs.add("C");
	  hs.add("B");
	  //hs.forEach(System.out::print);
	  
	  Iterator<String> it=hs.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	  
	  
  }
}
