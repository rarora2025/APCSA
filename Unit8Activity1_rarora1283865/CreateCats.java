/**
 * @author Rahul Arora

 */

public class CreateCats {
	
	//creating a function that displays all attributes given a cat
	public static void displayAttributes(Cat cat, int number) {
		System.out.println("Displaying attributes for cat " + number);
		System.out.println("-------------------------------");
		System.out.println("Name: " +cat.getName());
		System.out.println("Sex: " +cat.getSex());
		System.out.println("Age: " + cat.getAge());
		System.out.println("Breed: " +cat.getBreed());
		System.out.println("Weight: " +cat.getWeight());
		System.out.println();
		System.out.println();
		
	}
	public static void main(String[] args) {
		//creating first cat
		Cat catOne = new Cat();
		
		//setting attributes of first cat
		catOne.setAge(10);
		catOne.setBreed("tiger");
		catOne.setWeight(60.4);
		catOne.setSex('M');
		catOne.setName("bob");
		
		//displaying attributes of the first cat
		displayAttributes(catOne, 1);
		
		//creating the second cat
		Cat catTwo = new Cat();
		
		//setting attributes of the second cat
		catTwo.setAge(12);
		catTwo.setBreed("sphynx");
		catTwo.setWeight(20.2);
		catTwo.setSex('F');
		catTwo.setName("olivia");
		
		//displaying attributes of the first cat
		displayAttributes(catTwo, 2);

		
		//changing attributes of cat 1
		catOne.setAge(11);
		catOne.setName("tom");
		
		//re-displaying attributes of the first cat
		displayAttributes(catOne, 1);
		
		//changing attributes of cat 2
		catTwo.setAge(13);
		catOne.setWeight(21.2);
		
		//re-displaying attributes of the first cat
		displayAttributes(catTwo, 2);
		
		//making cat two meow
		System.out.println(catTwo.meow());
		
		
		
		
		

	}

}
