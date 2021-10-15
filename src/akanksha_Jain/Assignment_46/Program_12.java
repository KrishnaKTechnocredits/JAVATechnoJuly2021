/* Assignment 46 - Collections : 4th Oct'2021
Example 12 : Remove all zeros from given ArrayList.
input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6] */

package akanksha_Jain.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_12 {

	ArrayList<Integer> removeAllZeros(ArrayList<Integer> al) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(Integer num : al) {
			if(num != 0)
				output.add(num);
		}
		return output;
	}

	public static void main(String[] args) {
		Integer[] input = {10,0,0,1,0,3,0,2,6};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		Program_12 p12 = new Program_12();
		System.out.println("Input- " + al);
		System.out.println("Remove all zeros from input list- " + p12.removeAllZeros(al));
	}
}