package aniket;

import java.util.ArrayList;
import java.util.Arrays;

/*Find missing number in a range [1-10] from given ArrayList. 
input : [1,6,2,5,7,6,3,10]
output : [4,8,9] Hint : Method Parameter should be ArrayList, return type should be ArrayList.*/
public class Assignment_46_10 {

	ArrayList<Integer> getMissingNumber(int startIndex, int endindex) {
		ArrayList<Integer> listNumbers = new ArrayList<Integer>(Arrays.asList(1, 6, 2, 5, 7, 6, 3, 10));
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = startIndex; index <= endindex; index++) {
			if (!listNumbers.contains(index))
				output.add(index);

		}
		return output;

	}

	public static void main(String[] args) {
		System.out.println("The missing number from an array are : " + new Assignment_46_10().getMissingNumber(1, 10));
	}

}

