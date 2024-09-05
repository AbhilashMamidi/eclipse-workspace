package interThreadCommunication2;

public class Student extends Thread
{
  String name;
  WhiteBoard wb;
public Student(String name, WhiteBoard wb)
{
	super();
	this.name = name;
	this.wb = wb;
}
public void run()
{
	String text;
	wb.attendence();
	do
	{
		text=wb.read();
		System.out.println(name+"Reading"+text);
		System.out.flush();
		
	} while (!text.equals("end"));
}
 
}
