
class Person2
{
	private String name;
	private int age;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}

public class OOPsEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 person = new Person2();

	    // Set values using setter methods
	    person.setName("Arthfael Viktorija");
	    person.setAge(25);
	    person.setCountry("USA");

	    // Get values using getter methods
	    String name = person.getName();
	    int age = person.getAge();
	    String country = person.getCountry();

	    // Print the values
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Country: " + country);
	  }

	}


