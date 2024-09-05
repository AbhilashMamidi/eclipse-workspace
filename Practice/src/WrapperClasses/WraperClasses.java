package WrapperClasses;

public class WraperClasses 
{
  public static void main(String[] args) 
  {
//	  @SuppressWarnings("removal")
//	  Integer i=new Integer(10);
//	  Integer a=Integer.valueOf(10);
//	  Integer b=10;
//	  
//	  Byte c=15;
//	  Byte d=Byte.valueOf("15");
//	  byte b=15;
//	  Byte e=Byte.valueOf(b);
//	  
//	  Short f=Short.valueOf("123");
//	  Float g=12.3f;
//	  
//	  Double h=Double.valueOf(123.4);
//	  Boolean j=Boolean.valueOf("true");
//	  Character k=Character.valueOf('A');
//	  
	  
//	  int m1=15;
//	  Integer m2=m1;
//	  m2.equals(m1);
//	  System.out.println(m2.equals(m2));
	  Integer m2=Integer.valueOf("123");
	  Integer m3=Integer.valueOf("A7",16);
	  Integer m4=Integer.decode("0XA7");
	  
	 // System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
	  System.out.println(Integer.toBinaryString(10));
	  
	Integer s1=Integer.valueOf(12);
	System.out.println(s1.toBinaryString(s1));
	  
  }
}
