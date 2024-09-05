package collection.Properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class Properties1 
{
 public static void main(String[] args)
 {
	 
	 //Property is the key value pair	
	Properties p=new Properties();
	p.setProperty("Brand", "Dell");
	p.setProperty("Processer", "i7");
	p.setProperty("OS", "Windows11");
	p.setProperty("Model", "Latitude");
	//p.store(new FileOutputStream("/c/mydata.txt"),"Laptop");
	System.out.println(p);
 }
}
