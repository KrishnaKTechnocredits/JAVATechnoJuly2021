
package dattaraj.dattaraj_Assignment_48;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_10 {
	
	void appendZeroAfterConsecutiveNumbers(Integer[] input) {
		System.out.println("Add zero after three consecutive numbers in given array- " + Arrays.toString(input));
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> output = new ArrayList<>();
		output.add(list.get(0));
		output.add(list.get(1));
		for(int index=2; index<list.size(); index++) {
			output.add(list.get(index));
			if(list.get(index-1) == list.get(index)-1 && list.get(index-2) == list.get(index)-2) {
				output.add(0);
			}
		}
		System.out.println("Output- " + output);
	}

	public static void main(String[] args) {
		Integer[] input = {1,2,3,5,4,7};
		new Program_10().appendZeroAfterConsecutiveNumbers(input);
	}
}