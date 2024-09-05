package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 
{
	 public static void main(String[] args)
	  {
		 LinkedList<Integer> al1=new LinkedList<>();
		 al1.add(12);
		 al1.add(13);
		 al1.add(0, 11);
		 al1.addFirst(121);
		 al1.addLast(212);
		 LinkedList<Integer> al2=new LinkedList<>(List.of(2,4,6,4,10));
		 System.out.println(al1);
		 System.out.println(al1.peek());
		 System.out.println(al1.poll());
		 System.out.println(al1.pop());
		 System.out.println(al1);
		 
	  }
}
