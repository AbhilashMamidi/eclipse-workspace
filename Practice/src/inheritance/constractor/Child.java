package inheritance.constractor;

public class Child extends Parent
{
  public Child()
  {
	  System.out.println("non-param child");
  }
  public Child(int y)
  {
	  System.out.println("param of child");
  }
  public Child(int x,int y)
  {
	  super(x); 
	  System.out.println("2 param of child :"+y);
  }
}
