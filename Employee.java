import java.util.Scanner;

public class Employee {
	
	String name;
	String jt;
	double salary;
	double ts;
	
	
	Employee(String name, String jt, double salary, double ts)
	{
		this.name = name;
		this.jt = jt;
		this.salary = salary;
		this.ts = ts;
	}
	
	void input()
	{
		System.out.println("\n");
		System.out.println("Input Employee Details: ");
		System.out.println("\n");
		Scanner in = new Scanner (System.in);
		System.out.print("Enter Name Of The Employee: ");
		name = in.nextLine();
		System.out.print("Enter Job Title Of The Employee: ");
		jt = in.nextLine();
		System.out.print("Enter Salary Of The Employee: ");
		salary = in.nextDouble();
		System.out.print("Enter Salary Raise Of The Employee (%): ");
		ts = in.nextDouble();
		System.out.println("\n");
		in.close();
	}
	
	double calc()
	{
		return salary + (salary * (ts / 100));
	}
	
	void display()
	{
		System.out.println("\n");
		System.out.println("Employee Details: ");
		System.out.println("\n");
		System.out.println("Name Of The Employee: " + name + "\n");
		System.out.println("Job Title Of The Employee: " + jt + "\n");
		System.out.println("Salary Of The Employee: " + salary + "\n");
		System.out.println("Revised Salary Of The Employee: " + calc() + "\n");
		System.out.println("\n");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee("", "", 0, 0);
		obj.input();
		obj.display();
		
		
		

	}

}
