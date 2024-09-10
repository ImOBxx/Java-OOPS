

class Employees {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employees(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10; // Default bonus is 10% of salary
    }

    public String generatePerformanceReport() {
        return "Performance report for " + name;
    }

    public void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Manager extends Employees {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // Managers get a 20% bonus
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is overseeing multiple projects.");
    }
}

class Developer extends Employees {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // Developers get a 15% bonus
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is developing a new project.");
    }
}

class Programmer extends Employees {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.12; // Programmers get a 12% bonus
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is programming a new feature.");
    }
}

public class Company {

    public static void main(String[] args) {
        Employees manager = new Manager("Alice Johnson", "123 Main St", 90000);
        Employees developer = new Developer("Bob Smith", "456 Elm St", 80000);
        Employees programmer = new Programmer("Carol Williams", "789 Pine St", 70000);

        printEmployeeDetails(manager);
        printEmployeeDetails(developer);
        printEmployeeDetails(programmer);
    }

    public static void printEmployeeDetails(Employees employee) {
        System.out.println("Name: " + employee.name);
        System.out.println("Address: " + employee.address);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Job Title: " + employee.jobTitle);
        System.out.println("Bonus: " + employee.calculateBonus());
        System.out.println(employee.generatePerformanceReport());
        employee.manageProject();
        System.out.println();
    }
}
