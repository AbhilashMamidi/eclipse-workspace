package collection;
import java.util.*;
public class PriorityQueue1 
{
  public static void main(String[] args)
  {
	PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new MyComp());
	pq.add(20);
	pq.add(10);
	pq.add(30);
	pq.add(5);
	pq.add(15);
	pq.add(3);
	
	System.out.println(pq);
	System.out.println(pq.peek());
	System.out.println(pq);
	pq.forEach((x)->System.out.println(x));
	System.out.println(pq.poll());
	System.out.println(pq);
	
  }
}
