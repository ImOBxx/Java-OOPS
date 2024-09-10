
interface Father
{
	int a = 20;
	int b = 30;
	 void addF();
}

interface Mother
{
	int x = 10;
	int y = 50;
	 void addM();
}

class Child implements Father, Mother
{
	
	
	public void addF()
	{
	int k;
	k=a+b;
	System.out.println("K: " + k);
	}
	@Override
	public void addM()
	{
		int l;
		l=x+y;
		System.out.println("L: " + l);
	}
	
	void calc()
	{
		int c = a + b + x + y;
		System.out.println("C: " + c);
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.calc();
		obj.addM();
		obj.addF();

	}

}
