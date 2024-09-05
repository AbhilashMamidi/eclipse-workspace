package new2024;
public class StringBuffer {
 
private static String name1;
private static String name2;

public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	 sb.name1="Abhilash";
	 sb.name2="abhilash";
	try {
		System.out.println(name1);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(name2);
}
}
