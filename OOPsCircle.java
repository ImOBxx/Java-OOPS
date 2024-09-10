import java.util.Scanner;

public class OOPsCircle {
	
	
	double area;
	double radius;
	double circumference;
	
	OOPsCircle(double radius)
	{
		this.radius = radius;
	}
	
	double areacalc(double radius)
	{
		return Math.PI * radius * radius;
	}
	
	double circalc(double radius)
	{
		return 2 * Math.PI * radius;
	}
	
	void input()
	{
		System.out.println("\n");
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Radius Of The Circle: ");
		radius = in.nextDouble();
		System.out.println("\n");
	}
	
	void show()
	{ 
		System.out.println("\n");
        System.out.println("The Area Of The Circle: " + round(areacalc(radius)));
        System.out.println("\n");
        System.out.println("The Circumference Of The Circle: " + round(circalc(radius)));
        System.out.println("\n");
        
	}
	double round(double value)
	{
		return Math.round(value * 100.0) / 100.0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPsCircle obj = new OOPsCircle(0);
		obj.input();
		obj.show();
		
		
		

	}

}
