/*Example 2 :
Write a program to find given number is duplicate in arrayList.*/
package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;

public class Program2 {
	void isNumberDuplicate(ArrayList<Integer> input,int number) {
		if(input.indexOf(number)!=input.lastIndexOf(number)) {
			System.out.println(number+" is a duplicate number");
		}
		else {
			System.out.println(number+" is a unique number");
		}
	}
	public static void main(String[] args) {
		Program2 program2 = new Program2();
		Integer[] arr = {2,5,8,4,9,2,5};
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
		program2.isNumberDuplicate(list1,5);
		program2.isNumberDuplicate(list1,9);
		program2.isNumberDuplicate(list1,2);

	}

}
