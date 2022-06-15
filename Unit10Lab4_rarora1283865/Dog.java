
public class Dog extends Pets {
	
	//constructor
	public Dog(String name, int weight, int age) {
		super(name, weight, age);
		// TODO Auto-generated constructor stub
	}

	//overriden method
	public void makeSound() {
		System.out.println("bow wow");
	}
	
}
