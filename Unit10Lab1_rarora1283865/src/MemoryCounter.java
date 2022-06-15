
public class MemoryCounter extends Counter {
	
	private int memory;
	
	public MemoryCounter() {
		super();
		this.memory = 0;
	}
	public MemoryCounter(int count, int memory) {
		super(count);
		this.memory = memory;
		
	}
	
	public void addMemory(){
		this.count += this.memory;
		
	}
	
	public void resetMemory() {
		this.memory = 0;
	}
	
	public int getMemory() {
		return this.memory;
	}
	

}
