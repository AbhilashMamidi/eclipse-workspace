package College;

public class StudentObject {

	public static void main(String[] args)
	{
	  Subject sub[]=new Subject[3];
	  sub[0]=new Subject("M101", "mos", 56);
	  sub[1]=new Subject("M102", "Ht", 76);
	  sub[2]=new Subject("M103", "Ht2", 33);
	  
     for (Subject subject : sub) 
     {
		System.out.println(subject);
	}
	}

}
