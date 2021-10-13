/*Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/
package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program4 {
	void removeDuplicates(ArrayList<Integer> input) {
		Set<Integer> set = new LinkedHashSet(input);
		System.out.println("ArrayList after removing duplicates : "+set);
	}

	public static void main(String[] args) {
		Program4 program4 = new Program4();
		Integer[] arr = {2,4,5,6,8,2,4,7};
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
		program4.removeDuplicates(list1);
		

	}

}
