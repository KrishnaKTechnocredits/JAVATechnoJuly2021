/* Assignment - 48 : 9th Oct'2021
program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList */

package sayli_Vyavhare.Assignment_48;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_10 {
	
	static void appendZeroAfterConsecutiveNum(Integer[] input) {
		System.out.println("After addition of zero after three consecutive num:");
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
		System.out.println(output);
	}

	public static void main(String[] args) {
		Integer[] input = {1,2,3,5,4,7};
	    appendZeroAfterConsecutiveNum(input);
	}
}