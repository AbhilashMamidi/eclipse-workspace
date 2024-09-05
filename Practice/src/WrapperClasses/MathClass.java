package WrapperClasses;

public class MathClass 
{
  public static void main(String[] args)
  {
	  
	  //Math class Methods
	 System.out.println("Absolute");
	 System.out.println(Math.abs(-123));
	
	 System.out.println("Absolute");
	 System.out.println(StrictMath.abs(-123));
	 
	 System.out.println("Cube Root");
	 System.out.println(Math.cbrt(27));
	 
	 System.out.println("Decrement Exact");
	 System.out.println(Math.decrementExact(7));
	 
	 System.out.println(Math.getExponent(12.3456));
	 
	 //Truncate
	 System.out.println(Math.floorDiv(50, 9));
	 
	 System.out.println(Math.exp(12));
	 System.out.println(StrictMath.exp(12));
	 
	 System.out.println(Math.log10(100));
	 
	 System.out.println(Math.max(100, 50));
	 
	 System.out.println(Math.tan(45*Math.PI/180));
	 System.out.println(Math.toRadians(45));
	 
	 System.out.println(Math.toDegrees(Math.atan(1)));
	 
	 System.out.println(Math.random());
	 System.out.println(Math.pow(2, 3));
	 System.out.println(Math.multiplyExact(100, 200));
	 
	 System.out.println( Math.nextAfter(12.5, 13));
  }
  
}
