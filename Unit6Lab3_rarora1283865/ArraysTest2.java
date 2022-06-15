
/**
 * 
 * @author Rahul Arora
 *
 */

import java.util.Arrays;

public class ArraysTest2 {
        public static void main(String[] args) {
        	
        	//defining test arrays
                char chararr[] = { 'z', 'l', '>', 'a', 'B', 'C', 'r' };
                char testchararr[] = { 'n', 'h', 'A', 'K', 'M', '`', '-' };
                int intarr[] = {13, 12, 89, 40, 55, 60, 2};
                int testintarr[] = {13, 12, 89, 40, 55, 60, 2};
                double doublearr[] = {3.98, 7.6, 93.45, 12.882, 1.32, 29.4, 12.32};
                double testdoublearr[] = {20.43, 13.45, 87.61, 56.8, 26.39, 99.81, 72.34};

              //testing equals()
                if (ArrayTools.equals(chararr, testchararr)) {
                	System.out.print(Arrays.toString(chararr));
                	System.out.print(" equals ");
                	System.out.print(Arrays.toString(testchararr));
                	System.out.println("");
                } else {
                	System.out.print(Arrays.toString(chararr));
                	System.out.print(" doesn't equal ");
                	System.out.print(Arrays.toString(testchararr));
                	System.out.println("");
                }
                
                if (ArrayTools.equals(intarr, testintarr)) {
                	System.out.print(Arrays.toString(intarr));
                	System.out.print(" equals ");
                	System.out.print(Arrays.toString(testintarr));
                	System.out.println("");
                } else {
                	System.out.print(Arrays.toString(intarr));
                	System.out.print("doesn't equal ");
                	System.out.print(Arrays.toString(testintarr));
                	System.out.println("");
                }
                
                if (ArrayTools.equals(doublearr, testdoublearr)) {
                	System.out.print(Arrays.toString(doublearr));
                	System.out.print("equals ");
                	System.out.print(Arrays.toString(testdoublearr));
                	System.out.println("");
                } else {
                	System.out.print(Arrays.toString(doublearr));
                	System.out.print("doesn't equal ");
                	System.out.print(Arrays.toString(testdoublearr));
                	System.out.println("");
                }
                
                //testing find()
                System.out.print("a is at index ");
                System.out.print(ArrayTools.find(chararr, 'a'));
                System.out.print(" of the array ");
                System.out.print(Arrays.toString(chararr));
                System.out.println("");
                
                System.out.print("55 is at index ");
                System.out.print(ArrayTools.find(intarr, 55));
                System.out.print(" of the array ");
                System.out.print(Arrays.toString(intarr));
                System.out.println("");
                
                System.out.print("7.6 is at index ");
                System.out.print(ArrayTools.find(doublearr, 7.6));
                System.out.print(" of the array ");
                System.out.print(Arrays.toString(doublearr));
                System.out.println("");
                
                //testing sort()
                System.out.print("the char array sorted (ascending): ");
                ArrayTools.sort(chararr);
                System.out.println(Arrays.toString(chararr));
                
                System.out.print("the integer array sorted (ascending): ");
                ArrayTools.sort(intarr);
                System.out.println(Arrays.toString(intarr));
                
                System.out.print("the double array sorted (ascending): ");
                ArrayTools.sort(doublearr);
                System.out.println(Arrays.toString(doublearr));


        }
}