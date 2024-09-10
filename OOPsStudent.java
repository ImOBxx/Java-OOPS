
import java.util.ArrayList;
import java.util.Scanner;



class Student
{
	String name;
	String Class;
	double percentage;
	
	
	
    ArrayList<Student> StudentList = new ArrayList<>();
    ArrayList<Student> StudentFirstList = new ArrayList<>();
    ArrayList<Student> StudentSecondList = new ArrayList<>();
    
    public Student(String name, String Class, double percentage) {
            this.name = name;
            this.Class = Class;
            this.percentage = percentage;
	}

	void add()
    {
	    
    	Scanner in = new Scanner (System.in);
    	char choice;
    	while(true)
    	{
    	System.out.println("Enter Student Name: ");
    	name = in.next();
    	System.out.println("Enter Student Class: ");
    	Class = in.next();
    	System.out.println("Enter Student Total Percentage: ");
    	percentage = in.nextDouble();
    	StudentList.add(new Student(name, Class, percentage));
    	System.out.println("Do you want to add more: ");
    	choice = in.next().charAt(0);
    	if (choice == 'Y' || choice == 'y')
    	{
    		continue;
    	}
    	else if (choice == 'N' || choice == 'n')
    	{
    		break;
    	}
    	else
    	{
    		System.out.println("Wrong Choice");
    		continue;
    	}
    	
    	}
    }
	
	
	void show()
	{
		System.out.println("All Students Details: ");
		for (Student stu : StudentList)
		{
			System.out.println("Students Name: " + stu.name);
			System.out.println("Students Class: " + stu.Class);
			System.out.println("Students Total Percentage: " + stu.percentage);
			
		}
		
		System.out.println("Students In First Div: ");
		for (Student stu : StudentFirstList)
		{
			
			System.out.println("Students Name: " + stu.name);
			System.out.println("Students Class: " + stu.Class);
			System.out.println("Students Total Percentage: " + stu.percentage);
			
		}
		
		System.out.println("Students In First Div: ");
		for (Student stu : StudentSecondList)
		{
			
			System.out.println("Students Name: " + stu.name);
			System.out.println("Students Class: " + stu.Class);
			System.out.println("Students Total Percentage: " + stu.percentage);
			
		}
	}
	
	void calc()
	{
	  for(Student stu:StudentList)
	  {
		  if(stu.percentage>=75)
		  {
			  StudentFirstList.add(new Student(stu.name,stu.Class,stu.percentage));
			  
		  }
	  }
	  
	  for (Student stu: StudentList)
	  {
		  if (stu.Class < )
		  {
			  StudentSecondList.add(new Student(stu.name, stu.Class, stu.percentage));
		  }
	  }
	}
	
	
    
	
}


public class OOPsStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student("", "", 0);
		obj.add();
		obj.calc();
		obj.show();
		

	}

}
