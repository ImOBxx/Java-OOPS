import java.util.Scanner;

public class Rectangle {
	
	float len;
	float b;
	
    Rectangle(float len, float b)
	{
		this.len = len;
		this.b = b;
	}
	
	void input()
	{
		Scanner in = new Scanner (System.in);
		System.out.println("\n");
		System.out.print("Enter Length: ");
		len = in.nextFloat();
		System.out.print("Enter Breadth: ");
		b = in.nextFloat();
		System.out.println("\n");
	}
	
	float areacalc()
	{
		return len * b;
	}
	
	float pericalc()
	{
		return (2 * (len + b));
	}
	
	void show()
	{
		System.out.println("\n");
		System.out.println("The Area Of The Rectangle: " + areacalc());
		System.out.println("The Perimeter Of The Rectangle: " + pericalc());
		System.out.println("\n");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle(0, 0);
		obj.input();
		obj.show();
		

	}

}
