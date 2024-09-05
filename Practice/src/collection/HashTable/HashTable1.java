package collection.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable1 
{
  public static void main(String[] args) 
  {
	Hashtable<Integer, String> ht=new Hashtable<>();
	ht.put(1, "A");
	ht.put(2, "D");
	ht.put(3, "C");
	ht.put(4, "B");
	
	  System.out.println( ht.get(3));
	System.out.println(ht);
	
	Enumeration<String> e = ht.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	Enumeration e1 = ht.keys();
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	ht.compute(2, (k,v)->v+"Z");
	System.out.println(ht);
	ht.computeIfAbsent(6, (k)->"Y"+k);
	System.out.println(ht);
	
  }
}
