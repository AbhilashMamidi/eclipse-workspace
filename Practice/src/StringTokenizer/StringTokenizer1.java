package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizer1 
{
  public static void main(String[] args) 
  {
	  //(==;)delimeters()This are single character only
	  String data="name=Abhilash;address=hyderabad;Degree=Btech;Course=Mech";
	StringTokenizer stk=new StringTokenizer(data,"=;");
	
	while(stk.hasMoreTokens())
	{
		System.out.println(stk.nextToken());
	}
  } 
}
