/**
 * prompts the user to enter four integer test scores for each of three students. 
 * For each of the students, it calculates and displays the minimum test score, the maximum test score, the average of the test scores, and a letter grade A, B, C, D, F. 
 * 
 * @author Rahul Arora
 *
 */
import java.util.Scanner;

public class Unit5Lab3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//for loop to repeat for each student
		for (int student = 1; student <=3; student++) {
			
			//printing student number
			System.out.println("Student #" + student);
			//new array with the students test scores
			double[] testScores = new double[4];
			for (int test = 0; test <=3; test++) {
				//prompting user to enter each test score; appending this to array
				System.out.printf("Enter Student %d's Grade for Test #%d: ", student, test+1);
				testScores[test] = scan.nextDouble();
			}
			//display stats for user
			calculateAndDisplayStats(student, testScores[0], testScores[1], testScores[2], testScores[3]);
			System.out.printf("\n");
			
			
			
		}
		

	}
	/*
	  The method calculateAndDisplayStats() displays display the minimum test score, the maximum test score, the average of the test scores, and a letter grade A, B, C, D, F
	  
	  Pre-Conditions: test scores, testx and student_num
	                  
	 Post-Conditions: stats for user have been displayed
	  */
	public static void calculateAndDisplayStats(int student_num, double test1, double test2, double test3, double test4) {
		System.out.printf("\nStudent #%d's Worst Grade was %.0f \n", student_num, Math.min(Math.min(test1, test2), Math.min(test3, test4)));
		System.out.printf("Student #%d's Best Grade was %.0f \n", student_num, Math.max(Math.max(test1, test2), Math.max(test3, test4)));
		System.out.printf("Student #%d's Average Grade was %.1f \n", student_num, averageOf4Grades(test1, test2, test3, test4));
		System.out.printf("Student #%d's Letter Grade is %c \n", student_num, convertGradeToLetter(averageOf4Grades(test1, test2, test3, test4)));
		
		

	}
	/*
	  The method averageOf4Grades() returns the average of the four grades given
	  
	  Pre-Conditions: 4 double test scores, test #X
	                  
	 Post-Conditions: average returned as a double
	  */
	public static double averageOf4Grades(double first, double second, double third, double fourth) {
		return (double) ((first+second+third+fourth)/4);
		
	}
	/*
	  The method convertGradeToLetter() returns the grade LETTER for a given grade (#)
	  
	  Pre-Conditions: a double grade average
	                  
	 Post-Conditions: average converted to letter
	  */
	public static char convertGradeToLetter(double non_rounded_grade) {
		int grade = (int) Math.round(non_rounded_grade);
		if (between(grade, 90, 100)) {
			  return 'A';
			} else if (between(grade, 80, 89)) {
				return 'B';
			} else if (between(grade, 70, 79)) {
				return 'C';
				}else if (between(grade, 65, 69)) {
					return 'D';
				} else {
					return 'F';
				}
		
	}
	/*
	  The method between() checks is a given number is between two other numbers
	  
	  Pre-Conditions: a number (grade), and two numbers- that define each grade level
	                  
	 Post-Conditions: wether or not the grade meets that grade letter is returned
	  */
	
	public static boolean between(int num, int smaller, int larger) {
		  return smaller <= num && num <= larger;
		}
	

}
