import java.util.Scanner;

class Student9
{
	private
	
	int admo;
	String sname;
	float eng;
	float math;
	float sci;
	
	public
	
	float ctotal()
	{
		return eng + math + sci;
	}
	
	void Takedata()
	{
		System.out.println("\n");
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Student Admission Number: ");
		admo = in.nextInt();
		System.out.println("Enter Student Name: ");
		sname = in.next();
		System.out.println("\n");
		System.out.println("Enter Student's Marks In English: ");
		eng = in.nextInt();
		System.out.println("Enter Student's Marks In Maths: ");
		math = in.nextInt();
		System.out.println("Enter Student's Marks In Science: ");
		sci = in.nextInt();
		System.out.println("\n");
		
	}
	
	void Showdata()
	{
		System.out.println("\n");
		System.out.println("Student Admission Number: " + admo);
		System.out.println("Student Name: " + sname);
		System.out.println("\n");
	    System.out.println("Student's Marks In English: " + eng);
		System.out.println("Student's Marks In Maths: " + math);
        System.out.println("Student's Marks In Science: " + sci);
        System.out.println("\n");
        System.out.println("Student Total Marks: " + ctotal());
        System.out.println("\n");
	}
	
}


public class OOPsStudent9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student9 obj = new Student9();
		obj.Takedata();
		obj.Showdata();

	}

}
