/*
 * @author Rahul Arora
 */

public class Counter {
	
	//count variable- holds the COUNT
	
	static int count; 
	
	//constructor in which given a count
	public Counter(int count){
		this.count = count;
		
	}
	
	//default constructor: count starts at 0
	public Counter(){
		this.count = 0;
		
	}
	
	//incrementing count
	//pre-condition: a value of count, a variable count that has been created
	//post-condition: the value of count has been increased by 1
	
	public void incrementCount() {
		count += 1;
	}
	
	//decrementing count
	//pre-condition: a value of count, a variable count that has been created
	//post-condition: the value of count has been decreased by 1
	public void decrementCount() {
		count -= 1;
	}
	
	//reseting count
	//pre-condition: a value of count, a variable count that has been created
	//post-condition: the value of count is equal to zero
	public void resetCount() {
		count = 0;
	}
	
	//returning count
	public static int getCount() {
		return count;
	}
	
	
	
	
	
	
	
}
