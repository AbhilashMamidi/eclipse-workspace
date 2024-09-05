package collection;
import java.util.*;
public class DequeDemo 
{
  public static void main(String[] args) 
  {
	ArrayDeque< Integer> dq=new ArrayDeque<Integer>();
	dq.offerLast(6);
	dq.offerLast(7);
	dq.offerLast(8);
	dq.offerLast(9);
	dq.offerLast(10);
	System.out.println(dq.pollLast());
	//dq.forEach((x)->System.out.print(x+" , "));
	dq.offerFirst(5);
	dq.offerFirst(4);
	dq.offerFirst(3);
	dq.offerFirst(2);
	dq.offerFirst(1);
	//dq.forEach((y)->System.out.print(y+" , "));
	dq.forEach((x)->System.out.print(x+" , "));
  } 
}
