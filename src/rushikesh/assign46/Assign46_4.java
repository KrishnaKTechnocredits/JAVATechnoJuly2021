package rushikesh.assign46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Example 4:  
//Write a program to remove duplicate from ArrayList (using set).
//Make sure element order remain same.


public class Assign46_4 {
	static void isRemoveDuplicate(ArrayList<Integer> input) {
		Set<Integer> set = new LinkedHashSet<Integer>(input);
		System.out.println(set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = {1, 6, 2, 9, 3, 0, 2, 4,1,9};
		ArrayList<Integer> arraysList = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(arraysList);
		isRemoveDuplicate(arraysList);

	}
	
}
