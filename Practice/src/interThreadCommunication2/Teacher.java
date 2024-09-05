package interThreadCommunication2;

public class Teacher extends Thread
{
  WhiteBoard wb;
  String note[]={"java is Language","It is oops","It is platform Independent","It supports Thread","end"};
  public Teacher(WhiteBoard w)
  {
	  wb=w;
  }
  public void run()
  {
	  for (int i=0;i<note.length;i++)
	  {
		  wb.write(note[i]);
	  }
  }
  
}
