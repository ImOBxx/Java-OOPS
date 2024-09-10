import java.util.Scanner;

public class Employee2 {
	
	String name;
	String jt;
	int salary;
	int rs;
	
	Employee2 (String name, String jt, int salary, int rs)
	{
		this.name = name;
		this.jt= jt;
		this.salary = salary;
		this.rs = rs;
	}
	
	void input()
	{
		System.out.println("\n");
		System.out.println("ENTER EMPLOYEE SALARY DETAILS: ");
		System.out.println("\n");
		Scanner in = new Scanner (System.in);
        System.out.println("Enter Name Of The Employee: ");
        name = in.nextLine();
        System.out.println("Enter Job Title Of The Employee: ");
        jt = in.nextLine();
        System.out.println("\n");
        System.out.println("Enter Salary Of The Employee: ");
        salary = in.nextInt();
        System.out.println("Enter Salary Raise Percentage Of The Employee: ");
        rs = in.nextInt();
        System.out.println("\n");
       
    }
	
	int calc()
	{
		return salary + ((salary * rs) / 100);
	}
	
	void show()
	{
		System.out.println("\n");
		System.out.println("EMPLOYEE SALARY REVIEW :-");
		System.out.println("\n");
		System.out.println("Name Of The Employee: " + name);
        System.out.println("Job Title Of The Employee: " + jt);
        System.out.println("\n");
        System.out.println("Initial Salary Of The Employee: " + salary);
        System.out.println("Salary Raise Percentage Of The Employee: " + rs + "%");
        System.out.println("Revised Salary: " + calc());
        System.out.println("\n");
       
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 obj = new Employee2("", "", 0, 0);
		obj.input();
		obj.show();
		
		

	}

}
