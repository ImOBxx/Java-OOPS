
class Animal5
{
	void move() {
	}
	{
		System.out.println("Animals are Fast.");
	}
}

class Cheetah extends Animal5
{
	@Override
	void move()
	{
		System.out.println("Cheetahs are The Fastest Animals.");
	}
}



public class InheritanceAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetah obj = new Cheetah();
		obj.move();

	}

}
