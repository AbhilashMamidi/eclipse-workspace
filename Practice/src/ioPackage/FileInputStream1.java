package ioPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 
{
  public static void main(String[] args)
  {
	try 
	{
		    FileInputStream fis=new FileInputStream("C://MyJava/Text.txt");		
			byte[] b=new byte[fis.available()];
			fis.read(b);
			String str=new String(b);
			System.out.println(str);		
	} 
	catch (FileNotFoundException e) 
	{
			e.printStackTrace();
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
  }
}
