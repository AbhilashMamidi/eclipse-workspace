package WrapperClasses;


enum dept
{
	   CS("abhi","hyd"),IT("Akhil","ibp"),CIV("Arun","Bpt"),ECE("Akshay","Kmr");  
	//Constructor must be private or default
	
	String Name;
	String Location;
	private  dept(String name,String loc)
	{
		this.Name=name;
		this.Location=loc;
	}
	public String getname()
	{
		return Name;
	}
	public String getlocation()
	{
		return Location; 
	}
	public void dislay()
	{
		System.out.println(this.name() +" "+this.ordinal());
	}
}
public class Enum
{
   public static void main(String[] args) 
   {
	  dept d=dept.ECE;
	  System.out.println(d.getname());
	  System.out.println(d.getlocation());

     /*
	  switch (d) 
      {
	    case CS: System.out.println("Head :john /Block A");
	    break;
	    case IT: System.out.println("Head :Arun /Block B");
	    break;
	    case CIV: System.out.println("Head :Anvesh /Block C");
	    break;
	    case ECE: System.out.println("Head :Srikanth /Block D");
	    break;
	 }
	 */
   }
}
