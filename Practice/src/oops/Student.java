package oops;

public class Student 
{
 public String rollNo;	
 public String studentName;
 public String course;
 public int m1,m2,m3;
 
 public double  totalMarks()
 {
	 return m1+m2+m3;
 }
 public float avergeMarks()
 {
	 return (float)totalMarks()/3;
 }
 public char grade()
 {
	 if(avergeMarks()>=90)
	 {
		 return 'A';
	 }
	 else if(avergeMarks()>=80)
	 {
	   return 'B';
	 }
	 else if(avergeMarks()>=70)
	 {
	   return 'C';
	 }
	 else if(avergeMarks()>=60)
	 {
	   return 'D';
	 }
	 else if(avergeMarks()>=50)
	 {
	   return 'E';
	 }
	
	return 'F';
 }
	public  String studentDetails()
	{
		return "RollNo :"+rollNo+"\n"+"Student Name :"+studentName+"\n"+"Student Course :"+course+ "\n";
	}
 
 public static void main(String[] args)
 {
	Student student=new Student();
	
	student.rollNo="1";
	student.studentName="Akash";
	student.course="mech";
	student.m1=55;
	student.m2=67;
	student.m3=88;
	
	System.out.println("Student Details: \n "+student.studentDetails());
	System.out.println("Student total Marks :"+student.totalMarks());
	System.out.println("Student average Marks  :"+student.avergeMarks());
	System.out.println("Student grade is :"+student.grade());
	
	
	System.out.println("_______________________________________________________");
    Student student2=new Student();
	
	student2.rollNo="2";
	student2.studentName="Arun";
	student2.course="EEE";
	student2.m1=15;
	student2.m2=17;
	student2.m3=98;
	System.out.println("Student Details: \n "+student2.studentDetails());

	System.out.println("Student total Marks :"+student2.totalMarks());
	System.out.println("Student average Marks  :"+student2.avergeMarks());
	System.out.println("Student grade is :"+student2.grade());
 }
 
}
