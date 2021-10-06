/*Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/

package astha.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Assignment8 {

	LinkedList<Integer> getNegativeNumber(Integer[] input){
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		LinkedList<Integer> negativeNumList = new LinkedList<Integer>();
		for(int index=0; index<list.size();index++) {
			if(list.get(index) < 0 )
				if(index == list.indexOf(list.get(index)))
					negativeNumList.add(list.get(index));				
		}
		return negativeNumList;
	}
	
	public static void main(String[] args) {
		Assignment8 assignment8 = new Assignment8();
		Integer[] input = {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		System.out.println(assignment8.getNegativeNumber(input));
	}
}
