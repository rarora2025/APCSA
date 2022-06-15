
public class MemoryCounter extends Counter {
	
	//new variable, memory
	private static int memory;
	
	public MemoryCounter() {
		//running old default constructor, and setting memory to a default value
		super();
		this.memory = 0;
		
	}
	
	//new constructor, with both count and memory
	public MemoryCounter(int count, int memory) {
		super(count);
		this.memory = memory;
		
	}
	
	//this function adds the current count to the memory
	public void addMemory(){
		this.memory += this.count;
		
	}
	
	
	//this function resets the memory
	public void resetMemory() {
		this.memory = 0;
	}
	
	//this function returns the memory
	public static int getMemory() {
		return memory;
	}
	

}
