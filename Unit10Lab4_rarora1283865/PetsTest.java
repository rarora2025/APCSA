import java.util.Scanner;

public class PetsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//defining first scanner to get number of dogs and pets
		Scanner scan1 = new Scanner(System.in);
		
		//asking for number of pets
		System.out.printf("How many Pets? ");
		int numberOfPets = scan1.nextInt();
		
		//creating new pet array using number of pets
		Pets[] pets = new Pets[numberOfPets];
		
		//asking for number of dogs
		System.out.printf("How many Dogs? ");
		int dogs = scan1.nextInt();
		
		//we know that all pets that aren't dogs, are cats; calculating cats
		int cats = numberOfPets - dogs;
		
		//checking to make sure number of dogs isnt more than pets
		if (dogs > numberOfPets){
			System.out.println("ERROR: number of dogs cannot be greater than number of pets specified.");
			
		}
		
		
		//looping through all dogs and getting details for each
		for (int i = 1; i <= dogs; i++) {
			//scanner for dog
			Scanner scan = new Scanner(System.in);
			
			//getting name of certain dog
			System.out.println();
			System.out.printf("Enter name for dog #%d: ", i);
			String name = scan.nextLine();
			//getting age of certain dog
			System.out.printf("Enter age for dog #%d: ", i);
			int age = scan.nextInt();
			//getting weight of certain dog
			System.out.printf("Enter weight for dog #%d: ", i);
			int weight = scan.nextInt();
			//creating dog in array with those attributes
			pets[i-1] = new Dog(name, weight, age);
			
		}
		
		//looping through all cats and getting details for each
		for (int i = 1; i <= cats; i++) {
			//scanner for cat
			Scanner scan2 = new Scanner(System.in);
			System.out.println();
			//getting name of certain cat
			System.out.printf("Enter name for cat #%d: ", i);
			String name = scan2.nextLine();
			//getting age of certain cat
			System.out.printf("Enter age for cat #%d: ", i);
			int age = scan2.nextInt();
			//getting weight of certain cat
			System.out.printf("Enter weight for cat #%d: ", i);
			int weight = scan2.nextInt();
			//creating cat in array with those attributes
			pets[dogs + i-1] = new Cat(name, weight, age);
			
		}
		//looping through all pets and printing the information for each
		int currentPet = 1;
		for(Pets pet:pets) {
			//checking to see if dog or cat
			String pet_type = (currentPet <= dogs ? "Dog" : "Cat");
			System.out.println("");
			//printing information
			System.out.println("Info for Pet #" + currentPet + " (" + pet_type + "):");
			System.out.println("Name: " + pet.name);
			System.out.println("Age: " + pet.age);
			System.out.println("Weight: " + pet.weight);
	
			pet.makeSound();
			currentPet++;
			
		}

	}

}
