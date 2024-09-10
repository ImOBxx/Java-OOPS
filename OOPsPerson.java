import java.util.Scanner;

public class OOPsPerson {
	
	String name;
	int age;
	
	 OOPsPerson(String name, int age)
	 {
		 this.name = name;
		 this.age = age;
		 
	 }
	
	
	void input()
	{
		System.out.println("\n");
		System.out.println("Input Person's Details :- ");
		System.out.println("\n");
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Name: ");
		name = in.nextLine();
		System.out.println("Enter Age: ");
		age = in.nextInt();
		in.close();
	}
	
	void display()
	{
		System.out.println("\n");
		System.out.println("Person's Details :- ");
		System.out.println("\n");
		System.out.println("Name Of The Person: " + name);
		System.out.println("Age Of The Person: " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPsPerson obj = new OOPsPerson("", 0);
		obj.input();
		obj.display();
		
		

	}

}
