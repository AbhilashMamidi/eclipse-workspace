package abstractPackage;

public class MainClass 
{
  public static void main(String[] args)
  {
	Hospital h=new MyHospital();
	h.admit();
	h.appointment();
	h.billing();
	h.emergency();
  }
}
