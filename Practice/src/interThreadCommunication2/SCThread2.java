package interThreadCommunication2;

public class SCThread2 
{
 public static void main(String[] args)
 {
    WhiteBoard wb=new WhiteBoard();
    Teacher t=new Teacher(wb);
    Student s1=new Student("1.Abhi", wb);
    Student s2=new Student("2.Abhilash", wb);
    Student s3=new Student("3.Abhishek", wb);
    Student s4=new Student("4.Akihl", wb);
    t.start();
    s1.start();
    s2.start();
    s3.start();
    s4.start();
 }
}
