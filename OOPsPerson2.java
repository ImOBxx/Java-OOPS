import java.util.Scanner;

public class OOPsPerson2 {
	
	String name;
	int age;
	
	OOPsPerson2(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void input()
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Name Of The Employee: ");
		name = in.nextLine();
		System.out.println("Enter Age Of The Employee: ");
		age = in.nextInt();
	}
	
	void display()
	{
		System.out.println("Name Of The Employee: " + name);
		System.out.println("Age Of The Employee: " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPsPerson2 obj = new OOPsPerson2("", 0);
		obj.input();
		obj.display();

	}

}
