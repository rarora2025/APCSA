/**
 * generates the same sequence of random numbers (from set) and displays the results
 * 
 * @author Rahul Arora
 * 
 *
 */

package com.java2novice.random;
 
import java.util.Random;
 
public class Part4_RandomClass {
	
	//defining static variables
	static int set[] = { 6, 10, 14, 18, 22 };
	static int numOf6;
	static int numOf10;
	static int numOf14;
	static int numOf18;
	static int numOf22;
	
 //static so i don't need to make a new object of class to call it
	
    public static void generateSequence(){
    	 //reseting all the variables
    	numOf6 = 0;
    	numOf10 = 0;
    	numOf14 = 0;
    	numOf18 = 0;
    	numOf22 = 0;
    	
    	
        Random rounder = new Random(71906);
      //71906 is the number that needs to stay constant for the sets to stay the same each time they are generated
        
        for(int counter=1;counter<=100;counter++){
        	
        	//generating a random index of the array set, and getting the number at that index
            int randomNum = set[rounder.nextInt(5)];
            
            //switch statmenet to test which number was randomly selected
            switch (randomNum) {
            	case 6:
            		//increment num of sixes
            		numOf6 += 1;
            		break;
            	case 10:
            		//increment num of tens
            		numOf10 += 1;
            		break;
            	case 14:
            		//increment num of fourteens
            		numOf14 += 1;
            		break;
            	case 18:
            		//increment num of eighteens
            		numOf18 += 1;
            		break;
            	case 22:
            		//increment num of twenty-twos
            		numOf22 += 1;
            		break;
            	default:
            		//index out of range or other error occurred; check to make sure that the values of set are what they are supposed to be
            		System.out.println("ERROR OCCURED");
            		break;
            
            }
        }
    }
     
    public static void main(String args[]){
        generateSequence();
        //generating the sequence, then printing the results
        System.out.println("Number of 6's: " + numOf6);
        System.out.println("Number of 10's: " + numOf10);
        System.out.println("Number of 14's: " + numOf14);
        System.out.println("Number of 18's: " + numOf18);
        System.out.println("Number of 22's: " + numOf22);
       
    }
}