package methodOverriding;

public class MainCarClass
{
 public static void main(String[] args) 
 {
  Car c=new LuxaryCar();
  c.changeGear();
 // c.openRoof();
  c.start();
  c.accelerate();
 } 
}
