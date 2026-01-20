// Write a program to remove duplicate from ArrayList (without using set).

package suruchi.Assignment46;

import java.util.ArrayList;

public class Program3 {

	void removeDuplicate(ArrayList<Integer> input) {
		for(int index=0; index<input.size();index++) {
			if(input.indexOf(input.get(index)) != input.lastIndexOf(input.get(index)))
				input.remove(input.get(index));
		}
		System.out.println("ArrayList after removing duplicates : " +input);
	}
	
	public static void main(String[] args) {
		Program3 program3 = new Program3();
		
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(10);
		inputArray.add(34);
		inputArray.add(56);
		inputArray.add(33);
		inputArray.add(24);
		inputArray.add(56);
		inputArray.add(33);
		System.out.println("ArrayList before removing duplicates : " +inputArray);
		program3.removeDuplicate(inputArray);
	}
}