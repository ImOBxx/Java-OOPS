import java.util.Scanner;

public class Circle {
	
	double r;
	
	Circle(double r)
	{
		this.r = r;
	}
	
	void input()
	{
		System.out.println("\n");
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Radius Of The Circle: ");
		r = in.nextDouble();
	}
	
	double areacalc()
	{
		return Math.PI * r * r;
	}
	
	double pericalc()
	{
		return 2 * Math.PI * r;
	}
	
	void show()
	{
		System.out.println("\n");
		System.out.println("Area Of The Circle: " + areacalc());
		System.out.println("\n");
		System.out.println("Perimeter Of The Circle: " + pericalc());
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle(0);
		obj.input();
		obj.show();
	}

}
