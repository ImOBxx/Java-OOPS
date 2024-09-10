
class Employee4
{
	int salary;
	
	public Employee4(int salary)
	{
		this.salary = salary;
	}
	void work()
	{
		System.out.println("working as an employee");
	}
	
	int getSalary()
	{
		return salary;
	}
}

class HRManager extends Employee4
{
	public HRManager (int salary)
	{
		super(salary);
	}
	@Override
	void work()
	{
		System.out.println("\nManaging Employees");
	}
	
	
	void addEmployee()
	{
		System.out.println("\nAdding new Employees");
	}
}

public class OOPsEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee4 obj = new Employee4(4000);
		HRManager obj1 = new HRManager(7000);
		
		obj.work();
		System.out.println("Employee Salary: " + obj.getSalary());
		
		obj1.work();
		System.out.println("HR Manager Salary: " + obj1.getSalary());
		obj1.addEmployee();
		
		

	}

}
