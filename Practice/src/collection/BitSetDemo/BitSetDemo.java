package collection.BitSetDemo;

import java.util.BitSet;

public class BitSetDemo 
{
  public static void main(String[] args)
  {
	BitSet bs=new BitSet();
	bs.set(0);
	bs.set(2);
	bs.set(4);
	bs.set(6);
	bs.set(8);
	BitSet bs1=new BitSet();
	bs1.set(1);
	bs1.set(3);
	bs1.set(5);
	bs1.set(7);
	bs1.set(9);
	bs.or(bs1);
	System.out.println(bs);
	bs1.flip(0,bs1.length());
	System.out.println(bs1);

  }
}
