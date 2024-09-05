package oops;

public class HideRectangle
{
	 public static void main(String[] args)
	   {
		  Rectangle r1=new Rectangle();
		  r1.setLength(10);
		  r1.setBredth(10);
		 
		  System.out.println("Area of rectangle is :"+r1.area());
		  System.out.println("Perimeter of rectangle :"+r1.perimeter());
		  System.out.println("It is a square :"+r1.isSquare());	
		  
		  System.out.println("Length of rectangle is :"+r1.getLength());
		  System.out.println("Bredth of rectangle is :"+r1.getBredth());
	   } 
}
