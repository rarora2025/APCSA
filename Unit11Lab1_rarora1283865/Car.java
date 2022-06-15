/*
 * @author Rahul Arora
 * 
 */


public class Car {
	
	//attributes of a car
	String make;
	String model;
	int year;
	
	
	public Car() {
		
		//default values, won't be needed but just in case...
		this.make = "Mercedes Benz";
		this.model = "300C";
		this.year = 2019;
		
		
	}
	
	//constructor that is going to be used
	public Car(String make, String model, int year) {
		this.make = make;
		this.year = year;
		this.model = model;
		
	}

	
	

}
