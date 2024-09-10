
class Vehicle
{
	void drive()
	{
		System.out.println("Car.");
	}
}

class Car extends Vehicle
{
	@Override
	void drive()
	{
		System.out.println("Repairing A Car.");
	}
}

public class OOPsDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle Obj1 = new Vehicle();
		Car Obj = new Car();
		
		
		Obj1.drive();
		Obj.drive();
		
		

	}

}
