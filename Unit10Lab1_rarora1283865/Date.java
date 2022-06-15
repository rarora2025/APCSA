
public class Date {
	private int month;
	private int day;
	private int year;
	
	//constructors
	public Date() {
		month = 1;
		day = 1;
		year = 2021;
	}

	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	//set methods
	public void setDate(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	//get methods
	
	public int getMonth() {
		return this.month;
		
	}
	public int getDay() {
		return this.day;
		
	}
	public int getYear() {
		return this.year;
	}
	
	//to string method
	@Override
	public String toString() {
		
		return String.format("%d/%d/%d",getMonth(), getDay(), getYear());
		
	}
	
	

}
