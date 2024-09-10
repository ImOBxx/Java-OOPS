
class Person {
    String fname;
    String lname;

    Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFirstName() {
        return fname;
    }

    public String getLastName() {
        return lname;
    }
}

class Employee5 extends Person {
    static String jt = "EmployeeJobTitle";
    String employeeId;

    Employee5(String fname, String lname) {
        super(fname, lname);
        this.employeeId = jt; // Assuming jt represents the employee ID or job title.
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return lname + " (Employee)";
    }
}

public class Person5 {
    public static void main(String[] args) {
        Employee5 obj = new Employee5("Abhishek", "Banerjee");
        System.out.println("First Name: " + obj.getFirstName());
        System.out.println("Last Name: " + obj.getLastName());
        System.out.println("Employee ID/Title: " + obj.getEmployeeId());
    }
}
