import java.util.Scanner;

public class Unit5Lab2 {
	
	public static void main(String[] args) {
		
		//create new scanner
		Scanner scan = new Scanner(System.in);
		
		
		//ask user for month/year; call printMonthCalendar
		System.out.print("Enter a month (1-12): ");
		int month = scan.nextInt();
		System.out.print("Enter a year (e.g., 2012): ");
		printMonthCalendar(month, scan.nextInt());
	
		
	}
	
	/*
	  The method printMonthCalendar() prints the calendar for a specified month/year. 
	  
	  Pre-Conditions: The month value, m, is the given month, 
	  				  and the year value, y is the full year
	                       
	                  
	 Post-Conditions: A calendar for the given month/year has been printed 
	  */
	
	public static void printMonthCalendar(int m, int y) {
		printMonthHeader(m, y);
		PrintMonthBody(m, y);
		
	}
	/*
	  The method printSpaces() prints the approximate number of spaces necessary to center the title.
	  
	  Pre-Condition: The month value, m holds the month
	  Post-Conditions: The number of spaces before/after the title has been printed
	   
	  */
	public static void printSpaces(int m) {
		int spaces_per_side = (49-(getMonthName(m).length() + 4))/2;
		//for loop to print space appropriate amount of times
		for (int r = 0; r <= spaces_per_side; r++) 
			System.out.print(" ");
	}
	/*
	  The method printMonthHeader() displays the header info
	  Pre-Condition: The month value, m holds the month in numbers, and the year value, y holds the month in numbers
	  Post-Conditions: header printed
	   
	  */
	public static void printMonthHeader(int m, int y) {
		System.out.printf("\n", getMonthName(m), y);
		printSpaces(m);
		
		System.out.printf("%s%d", getMonthName(m), y);
		printSpaces(m);
		System.out.printf("\n\n", getMonthName(m), y);
		for (int n = 0; n < 51; n++) {
			System.out.print("-");
		}
		//prints days
		System.out.printf("\n\nSun\tMon\tTue\tWed\tThu\tFri\tSat\n\n");
		
		
	}
	
	/*
	  The method getMonthName() returns the name of the month for a specified month #
	  Pre-Condition: The month value, m holds the month in numbers
	  Post-Conditions: the name of the month is returned
	   
	  */
	
	public static String getMonthName(int m) {
		
		//switch statement to convert month # to name of month
		switch (m) {
		case 1:
			return "January ";
		case 2:
			return "February ";
		case 3:
			return "March ";
		case 4:
			return "April ";
		case 5:
			return "May ";
		case 6:
			return "June ";
		case 7:
			return "July ";
		case 8:
			return "August ";
		case 9:
			return "September ";
		case 10:
			return "October ";
		case 11:
			return "November ";
		case 12:
			return "December ";
		default:
			System.out.println("Invalid Month Given");		
			return "";			
		}
		
	}
	/*
	  The method isLeapYear() returns true if the specified year is a leap year, and returns false otherwise
	  Pre-Condition: The year value, y holds the year in numbers
	  Post-Conditions: returned whether or not the given year was a leap
	   
	  */
	public static boolean isLeapYear(int y) {
		
		//algorithm to check if year is leap
	    	if (y % 4 == 0 && ((y % 100 != 0) || (y % 400 == 0))) {
	    		return true;
	    		
	    	} else {
	    		return false;
	    	}

	    	
	    }
	/*
	  The method getNumDaysInMonth() returns the number of days in a specified month and year. Leap years are accounted for.
	 
	  Pre-Condition: The year value, y holds the year in numbers, and
	   The month value, m holds the month in numbers
	  Post-Conditions: returned number of days in that month
	   
	  */
	public static int getNumDaysInMonth(int m, int y) {
		
		int numOfDays = 0;
	
		 //switch statement to set the number of days to the corresponding number of days of the month given
		switch(m) {
		case 1:
			numOfDays = 31;
			break;
			
		case 2:
			if (isLeapYear(y) == true) {
				numOfDays = 29;
			} else {
				numOfDays = 28;
			}
			break;
				
			
			
		case 3:
			numOfDays = 31;
			break;
			
			
		case 4:
			numOfDays = 30;
			break;
			
		case 5:
			numOfDays = 31;
			break;
			
		case 6:
			numOfDays = 30;
			break;
			
		case 7:
			numOfDays = 31;
			break;
			
		case 8:
			numOfDays = 31;
			break;
			
		case 9:
			numOfDays = 30;
			break;
			
		case 10:
			numOfDays = 31;
			break;
			
		case 11:
			numOfDays = 30;
			break;
			
		case 12:
			numOfDays = 31;
			break;
			
		default:
			System.out.println("Invalid Month Given");
			break;
			
			
		
		}
		return numOfDays;
		
		
	}
	/*
	  The method PrintMonthBody() displays the days in the calendar associated with the corresponding days of the week.
	 
	  Pre-Condition: The year value, y holds the year in numbers, and
	   The month value, m holds the month in numbers
	  Post-Conditions: days of the month have been printed
	   
	  */
	
	 public static void PrintMonthBody(int m, int y) {
		 int counter1 = 1;
		 
		 int startDay = getStartDay(m, 1, y);
		 //prints tabs as many times as it needs to before the start day has begun
		 
		 while (counter1 <= startDay) {
			 System.out.printf("\t");
			 counter1++;
			 
		 }
	        

		 	int numDaysInMonth = getNumDaysInMonth(m, y);
		 	int counter2 = 1;
	
			 while (counter2 <= numDaysInMonth) {
				 System.out.printf("%d\t", counter2);
				 
		            if (((counter2 + startDay) % 7 == 0) || (counter2 == numDaysInMonth)) {
		            	 //prints tabs and new lines at the end of the week/month
		                System.out.printf("\t\n\n");
		            }
		            
				 counter2++;
				 
			 }
	  
	            
	        

	    }
	 /*
	  The method getStartDay() implements Zeller's Algorithm for determining the day of the
	  week the first day of a month is. The method adjusts Zeller's numbering scheme
	  for day of week ( 0=Saturday, ..., 6=Friday ) to conform to a day of week number
	  that corresponds to ISO conventions (i.e., 1=Monday, ..., 7=Sunday)
	  
	  Pre-Conditions: The month value, m,  is 1-12
	                        The day value, d, is 1-31, or 1-28, 1-29 for February
	                        The year value, y, is the full year (e.g., 2012)
	                  
	 Post-Conditions: A value of 1-7 is returned, representing the first day of the month
	                        1 = Monday, ..., 7 = Sunday
	  */
	 
	  public static int getStartDay(int m, int d, int y) {
	        // Adjust month number & year to fit Zeller's numbering system
	        if (m < 3) {
	            m = m + 12;
	            y = y - 1;
	        }

	        int k = y % 100; // Calculate year within century
	        int j = y / 100; // Calculate century term
	        int h = 0; // Day number of first day in month 'm'

	        h = (d + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

	        // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
	        int dayNum = ((h + 5) % 7) + 1;

	        return dayNum;
	    }

}
