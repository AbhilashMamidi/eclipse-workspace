package abstractPackage;

public class MyHospital extends Hospital
{

	@Override
	void emergency()
	{
		System.out.println("Emergency case");
		
	}

	@Override
	void appointment() {
		System.out.println("Appointment time 3:45");
		
	}

	@Override
	void admit() {
		// TODO Auto-generated method stub
		System.out.println("Emergency case patient admited");
		
	}

	@Override
	void billing() {
		// TODO Auto-generated method stub
		System.out.println("Billing of medicines");
		
	}
  
}
