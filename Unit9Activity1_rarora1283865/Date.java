/*
 * @author Rahul Arora
 */

public class Date {

	//defining attributes
	private int month;
	private int day;
	private int year;
	
	
	//creating a default constructor
	
	
	public Date() {
		month = 1;
		day = 1;
		year = 2021;
	}
	
	//constructor that takes in month day and year
	//pre condition- known date values
	//post condition- date values have been set
	public Date(int month, int day, int year) {
		
		//checking to make sure the month is valid (1-12)
		if (month > 0 && month < 13){
			this.month = month;
			
		} else {
			//throwing error if invalid
			throw new IllegalArgumentException("invalid Month");
		}
		
		//checking to make sure day is valid (1-31)
		if (day > 0 && day < 32){
			this.day = day;
			
		} else {
			//throw error if invalid
			throw new IllegalArgumentException("invalid Day");
		}
		
		this.year = year;
	}
	
	public void resetDate(int month, int day, int year) {
		// a setter
		//calling functions to reset the date, given new values
		
		//pre condition- new known date values
		//post condition- new values for m, d, and y can be set
		
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	public String getDate() {
		//return a string with m, d and y that can be displayed: (getter)
		
		 return String.format("The date is %d/%d/%d", getMonth(), getDay(), getYear());
	}

	//setters

	public void setMonth(int month) {
		//setting a new month if valid
		if (month > 0 && month < 13){
			this.month = month;
			
		} else {
			//throwing error if not valid
			throw new IllegalArgumentException("invalid Month");
		}
	}
	public void setDay(int day) {
		//setting a new day if given a valid one
		if (day > 0 && day < 32){
			this.day = day;
			
		} else {
			//throw error if not valid
			throw new IllegalArgumentException("invalid Day");
		}
	}
	
	//getters
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}

	
	

	
	

}
