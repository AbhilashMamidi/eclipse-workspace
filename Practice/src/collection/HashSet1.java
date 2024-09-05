package collection;
import java.util.*;
public class HashSet1 
{
  public static void main(String[] args)
  {
	  //Duplicates are not allowed in HashSet
	HashSet<Integer> hs=new HashSet<>(20,0.25f);
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(10);
    System.out.println(	hs.size());
	System.out.println(hs);
	Spliterator<Integer> it=hs.spliterator();
	System.out.println(it);
	Iterator<Integer> iterator = hs.iterator();
	System.out.println(iterator);
	
	
	
  } 
}
