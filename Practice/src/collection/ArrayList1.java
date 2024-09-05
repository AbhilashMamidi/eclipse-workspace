
package collection;
import java.util.*;
public class ArrayList1 
{
  public static void main(String[] args)
  {
	 ArrayList<Integer> al1=new ArrayList<>();
	 al1.add(12);
	 al1.add(13);
	 al1.add(0, 11);
	 
	 ArrayList<Integer> al2=new ArrayList<>(List.of(2,4,6,4,10));
	 al1.addAll(1,al2);
	 boolean s=al1.contains(19);
	 System.out.println(s);
	 System.out.println(al1);
	 System.out.println(al2);
	 System.out.println(al1.get(0)); 
	 System.out.println(al1.indexOf(4));
	 System.out.println(al1.lastIndexOf(4));
	 System.out.println(al1.removeAll(al2));
	 System.out.println(al1);
	 System.out.println(al2);
	 System.out.println(al2.size());
	 System.out.println(al1.set(2, 100));
	 System.out.println(al1);
	 
//	 for (int i = 0; i <al1.size(); i++)
//	 {
//		System.out.println(al1.get(i));
//   	} 
	 for (Integer i : al2)
	 {
		System.out.println(i);
	}
	 //Iterator 
	 Iterator<Integer> it=al1.iterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 //List Iterator->BI-directional)
	 ListIterator<Integer> lit=al1.listIterator();
	 while(lit.hasNext())
	 {
		 System.out.println(lit.next());
	 }
	 while(lit.hasPrevious())
	 {
		 System.out.println(lit.previous());
	 }
	 al1.forEach(n->System.out.println("---"+n));
	 
	 	 
  }
  static void show(int n)
  {
	  if(n>10)
	  {
		  System.out.println(n);
	  }
  }
}
