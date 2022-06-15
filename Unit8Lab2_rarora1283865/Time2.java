/*
 * @author Rahul Arora
 */



public class Time2 {
	
	//creating variables
	private int secondsincemidnight; //0-86,399
	private int current_second; //0-59
	private int current_minute; //0-59
	private int current_hour;  //0-23
	
	//set function
	public void setSecondsincemidnight(int seconds) {
		
		//checking to see if the user has entered more than one day
		if (seconds >= 86400) {
			seconds = seconds % 86400;
		}
		
		//calculating h,m,s and assigning it to the class' variables so they can be used in non-local places.
		this.secondsincemidnight = seconds;
		this.current_minute = (int) Math.floor((seconds / 60)%60);
		this.current_hour = (int) Math.floor(((seconds / 3600)));
		this.current_second = (int) seconds % 60;
	
	}
	
	//constructor that sets up the time 
	public Time2(int seconds) {
		setSecondsincemidnight(seconds);

	}


	//returning certain attributes
	public int getHour() { return this.current_hour; }
	public int getMinute() { return this.current_minute; }
	public int getSecond() { return this.current_second; }
	
	//convert to string in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	//convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((getHour()== 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12) ? "AM" : "PM");
	}
	
	
	}
	

	
	
	



