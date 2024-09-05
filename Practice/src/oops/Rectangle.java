package oops;

 class Rectangle 
{
 private double length;
 private double bredth ; 
 
 public double  getLength()
 {
	 return length;
 }
 public double  getBredth()
 {
	 return bredth;
 }
 public void setLength(double l)
 {
	 if(length>=0)
	 {
	 length=l;
	 }
	 else
	 {
		 length=0;
	 }
 }
 public void setBredth(double b)
 {
	 if(bredth>=0)
	 {
	 bredth=b;
	 }
	 else
	 {
		 bredth=0;
	 }
	 
 }
 public double area()
 {
	return length*bredth;	 
 }
 public double perimeter()
 {
	return 2*(length+bredth);	 
 }
 public boolean isSquare()
 {
	return length==bredth;	 
 }
  
   
}
