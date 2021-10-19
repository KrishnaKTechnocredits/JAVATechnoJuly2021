package avinash.assignment46;
/*Example 10 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]*/

import java.util.ArrayList;
import java.util.Arrays;

public class Example10 {
	static ArrayList<Integer> findMissingNumber(ArrayList<Integer> input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 1; index <= 10; index++) {
			if (!(input.contains(index))) {
				output.add(index);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = { 1, 6, 2, 5, 7, 6, 3, 10 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(findMissingNumber(arrayList));

	}

}
