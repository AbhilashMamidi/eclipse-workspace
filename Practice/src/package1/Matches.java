package package1;

public class Matches 
{
  public static void main(String[] args) 
  {
	  String str1="f";
	  System.out.println(str1.matches("."));
	  String str2="a";
	  System.out.println(str2.matches("[abc]"));
	  String str3="r";
	  System.out.println(str3.matches("[^abc]"));
	  String str4="%";
	  System.out.println(str4.matches("[a-z0-9]"));
	  
			
  }
}
