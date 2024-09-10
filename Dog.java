import java.util.Scanner;

public class Dog {
	
	String name;
	String breed;
	
	Dog(String name, String breed)
	{
		this.name = name;
		this.breed = breed;
	}
	
	void input()
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Name Of The Dog: ");
		name = in.nextLine();
		System.out.println("Enter Breed Of The Dog: ");
		breed = in.nextLine();
	}
	
	void display()
	{
		System.out.println("The Dog Named " + name + " Is Of The Breed " + breed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog("", "");
		obj.input();
		obj.display();

	}

}
