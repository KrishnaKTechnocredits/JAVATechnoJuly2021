package dattaraj;

import java.util.ArrayList;

public class Assignment46_18 {

	

	void removeElementFromArrayList(ArrayList<Integer> inputArray, Integer i) {
		// TODO Auto-generated method stub
		if(inputArray.contains(i)) {
			inputArray.remove(i);
			System.out.println("List after removing the element : " +inputArray);
		}else {
			System.out.println("Element is not present in the arraylist");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_18 pgm18 = new Assignment46_18();
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(25);		
		pgm18.removeElementFromArrayList(inputArray, 33);
	}

}
