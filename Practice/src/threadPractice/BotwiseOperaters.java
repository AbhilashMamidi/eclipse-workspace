package threadPractice;

public class BotwiseOperaters {
   public static void main(String[] args) {
	 int x=10;
	 int y=6;
	 int z=x&y;
	 System.out.println("x&y="+z);
	 int m=x|y;
	 System.out.println("x|y="+m);
	 int n=x^y;
	 System.out.println("x^y="+n);

	                 int p=0b1000;
	 int q=p<<1;
	 System.out.println("Left shift by 1 of 8 binary(p<<1)="+q);
	 int r=p<<2;
	 System.out.println("Left shift by 2 of 8 binary(p<<2)="+r);
	 
	 int a=p>>1;
	 System.out.println("Right shift by 1 of 8 binary(p>>1)="+a);
	 int b=p>>2;
	 System.out.println("Right shift by 2 of 8 binary(p<<1)="+b);
	 
	 int c=-0b1010;
	 int d=c>>1;
	 System.out.println("-0b1010="+String.format("%s",Integer.toBinaryString(c)));
	 System.out.println("c>>1   ="+String.format("%s",Integer.toBinaryString(d)));
	 
	 int e=c>>>1;
	 System.out.println("-0b1010="+String.format("%s",Integer.toBinaryString(c)));
	 System.out.println("c>>>1  ="+String.format("%32s",Integer.toBinaryString(e)));
	 
	  int u=0b1010;
	  int v=~u;
	  System.out.println("  ~u   ="+String.format("%s",Integer.toBinaryString(v)));
	  System.out.println("Normal Form = "+v);
}
}
