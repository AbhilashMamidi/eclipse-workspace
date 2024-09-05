package collection.TreeMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap1 
{
  public static void main(String[] args) 
  {
	TreeMap<Integer, String> tm=new TreeMap<Integer, String>(Map.of(0,"A",1,"B",2,"C",3,"D",4,"E",5,"F"));
	tm.put(7, "H");
	System.out.println("value :"+tm.ceilingEntry(6).getValue());
	System.out.println(tm.get(5));
	System.out.println(tm);
	
	Entry<Integer, String> e=tm.firstEntry();
	Entry<Integer, String> e1=tm.lastEntry();
	System.out.println(e.getKey()+"="+e.getValue());
	System.out.println(e1);
	
  }
}
