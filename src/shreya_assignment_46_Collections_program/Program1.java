/*Example 1 : 
Write a program to find given number is present in the arrayList or not. */

package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;

public class Program1 {
	void checkNumberIspresentOrNot(ArrayList<Integer> input,int number) {
		if(input.contains(number)) {
			System.out.println(number+" is present in the ArrayList");
		}
		else {
			System.out.println(number+" is not present in the ArrayList");
		}
	}
	public static void main(String[] args) {
		Program1 program1 = new Program1();
		Integer[] arr= {1,5,4,8,7,6,2,3};
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
		program1.checkNumberIspresentOrNot(list1, 9);
		program1.checkNumberIspresentOrNot(list1, 4);

	}

}
