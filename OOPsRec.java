import java.util.Scanner;

public class OOPsRec {
	
	float l;
	float b;
	
	OOPsRec(int l, int b)
	{
		this.l = l;
		this.b = b;
	}
	void input()
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Length: ");
		l = in.nextFloat();
		System.out.println("Enter Breadth: ");
		b = in.nextFloat();
		
	}
	
	float areacalc()
	{
		return l * b;
	}
	
	float pericalc()
	{
		return 2 * (l + b);
	}
	
	void display()
	{
		System.out.println("The Area Of The Rectangle: " + areacalc());
		System.out.println("The Perimeter Of The Rectangle: " + pericalc());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPsRec obj = new OOPsRec(0, 0);
		obj.input();
		obj.display();
		

	}

}
