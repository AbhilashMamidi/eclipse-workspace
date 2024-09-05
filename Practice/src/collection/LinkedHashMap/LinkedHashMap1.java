package collection.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1
{
  public static void main(String[] args) 
  {
	LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>(5,0.75f,true);
	
	lhm.put(1, "A");
	lhm.put(2, "B");
	lhm.put(3, "C");
	lhm.put(4, "D");
	lhm.put(5, "E");    
    lhm.forEach((k,v)->System.out.println(k+"="+v));
   String s= lhm.get(2);
          s=lhm.get(5);
   System.out.println(s);
	//System.out.println();
}
}
