package ioPackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 
{
  public static void main(String[] args)
  {
   try 
   {
	FileOutputStream	fos=new FileOutputStream("C://MyJava/Text.txt");
	String str="Learn Java Programming";
	fos.write(str.getBytes());
	fos.close(); 
   }
    catch (FileNotFoundException e)
   {
	System.out.println(e);
   }
   catch (IOException e)
   {
	
	e.printStackTrace();
   }
   
}
}
