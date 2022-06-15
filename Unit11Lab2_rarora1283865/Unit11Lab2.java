import java.util.ArrayList;

public class Unit11Lab2 {
	
	
	public static ArrayList<Integer> removeDuplicates( ArrayList<Integer> list )
	{
		
		ArrayList<Integer> newList= new ArrayList<Integer>();
		for (int o: list) {
			
			if (newList.contains(o)) {
				
			} else {
			newList.add(o);
	
			}
			
			
		}
		
		return newList;
		
	        
	}

	public static void main(String[] args) {
		
		
		//display the original list
		ArrayList<Integer> originalList= new ArrayList<Integer>();
		
		originalList.add(3);
		originalList.add(3);
		originalList.add(8);
		originalList.add(3);
		originalList.add(5);
		originalList.add(6);
		originalList.add(6);
		originalList.add(5);
			
		System.out.println("Original List: ");
		for (int integer : originalList) {
			System.out.println(integer);
		}
		System.out.println("");
		System.out.println("New List: ");
		originalList = removeDuplicates(originalList);
		for (int integer : originalList) {
			System.out.println(integer);
		}
		
		

	}

}
