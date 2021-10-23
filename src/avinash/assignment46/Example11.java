package avinash.assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 11 :
Remove all zeros from given ArrayList.
input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/
public class Example11 {

	static ArrayList<Integer> removeAllZeros(ArrayList<Integer> input) {
		while (input.contains(0)) {
			input.remove(new Integer(0));
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(removeAllZeros(arrayList));
	}

}
