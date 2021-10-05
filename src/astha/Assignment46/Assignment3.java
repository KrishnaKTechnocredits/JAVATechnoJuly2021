package astha.Assignment46;

import java.util.ArrayList;

public class Assignment3 {

	void removeDuplicate(ArrayList<Integer> input) {
		for(int index=0; index<input.size();index++) {
			if(input.indexOf(input.get(index)) != input.lastIndexOf(input.get(index)))
				input.remove(input.get(index));
		}
		System.out.println("ArrayList after removing duplicates : " +input);
	}
	
	public static void main(String[] args) {
		Assignment3 assignment3 = new Assignment3();
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(56);
		inputArray.add(33);
		System.out.println("ArrayList before removing duplicates : " +inputArray);
		assignment3.removeDuplicate(inputArray);
	}
}
