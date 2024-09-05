package ioPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 
{
  public static void main(String[] args) throws FileNotFoundException, IOException
  {
	try (FileReader fr=new FileReader("C://MyJava/Text.txt"))
	{
		
		int x;
		while((x=fr.read())!=-1)
		{
			System.out.println((char)x);
		}
	}
	
  }
}

