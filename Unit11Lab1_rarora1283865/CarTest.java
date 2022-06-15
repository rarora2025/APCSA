
//importing
import java.util.Scanner;
import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating new scanner which will retrieve appropriate number of cars
		Scanner scan = new Scanner(System.in);
		System.out.print("How Many Cars? (Min 5)  ");
	
		//getting number of cars
		int numOfCars = scan.nextInt();
		
		//checking to make sure user picked a valid number of cars
		if (numOfCars < 5) {
			System.out.println("ERROR: Not enough cars.");
			numOfCars = 5;
			
		}
		
		//new arrayList with all Cars
		ArrayList<Car> cars = new ArrayList<Car>();
		
		//looping through number of cars given, asking for info for each one 
		for (int n = 1; n <= numOfCars; n++) {
			//
			
			System.out.println("");
			
			//scanner to get info for each car
			Scanner getCar = new Scanner(System.in);
			
			//getting make
			System.out.print("Enter Make for Car #" + n + ": ");
			String make = getCar.nextLine();
			
			//getting model
			System.out.print("Enter Model for Car #" + n + ": ");
			String model = getCar.nextLine();
			
			//getting year
			System.out.print("Enter Year for Car #" + n + ": ");
			int year = getCar.nextInt();
			
			//creating car with all of that information 
			Car currentCar = new Car(make,model,year);
			
			//adding that car to the arrayList
			cars.add(currentCar);
			
		}
		
		//creating new arraylist for new and old cars 
		ArrayList<Car> newCars = new ArrayList<Car>();
		ArrayList<Car> oldCars = new ArrayList<Car>();
		
		//looping through all cars to check year and assign duplicate to appropriate array list
		for(Car car: cars) {
			//creating duplicate car
			Car newCar = new Car(car.make, car.model, car.year);
			
			//checking year and assigning it appropriately 
			if (car.year > 2010) {
				newCars.add(newCar);
			} else {
				oldCars.add(newCar);
			}

		}
		
		//displaying all info 
		System.out.println("");
		
		//header 
		System.out.println("All Cars:");
		
		//keeping track of which car
		int num = 1;
		
		//looping through all cars and printing info 
		for(Car car: cars) {
			System.out.println("Car " + num++ + ": " + car.year + " " + car.make + " " + car.model);
		}
		
		
		//header
		System.out.println("");
		System.out.println("New Cars:");
		
		//looping through all new cars and printing info 
		for(Car car: newCars) {
			System.out.println(car.year + " " + car.make + " " + car.model);
		}
		
		//header
		System.out.println("");
		System.out.println("Old Cars:");
		
		//looping through all old cars and printing info 
		for(Car car: oldCars) {
			System.out.println(car.year + " " + car.make + " " + car.model);
		}
		
	
		
		
		

}
}
