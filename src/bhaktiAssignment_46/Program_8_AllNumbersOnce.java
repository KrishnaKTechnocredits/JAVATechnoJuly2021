/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/

package bhaktiAssignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_8_AllNumbersOnce {
	
	static void negativeNumbersoNceWIthInsertionOrder(Integer[] input ) {
		ArrayList<Integer> num= new ArrayList(Arrays.asList(input));
		ArrayList<Integer>output= new ArrayList();
		for (int i=0; i< input.length; i++) {
			if (num.get(i) < 0) {
				if (!output.contains(num.get(i))){
						output.add(num.get(i));
				}		
			}
		}
		System.out.println(output);	
	}
	
	public static void main(String[] args) {
		Integer[] input= {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		negativeNumbersoNceWIthInsertionOrder(input);
	}
}

