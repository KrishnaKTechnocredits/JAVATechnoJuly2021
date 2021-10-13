/*Example 3 :
Write a program to remove duplicate from ArrayList (without using set).*/
package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;

public class Program3 {
	void removeDuplicates(ArrayList<Integer> input) {
		for(int index=0;index<input.size();index++) {
			if(input.indexOf(input.get(index))!=input.lastIndexOf(input.get(index))) {
				input.remove(input.get(index));
			}
		}
		System.out.println("ArrayList after removing duplicates : "+input);
	}
		public static void main(String[] args) {
		Program3 program3 = new Program3();
		Integer[] arr = {4,5,2,6,8,9,4};
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
		program3.removeDuplicates(list1);
	}

}
