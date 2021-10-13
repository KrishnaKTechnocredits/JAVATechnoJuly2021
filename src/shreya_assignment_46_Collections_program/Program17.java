
/*Example 17:
Write a program to add element at particular index of ArrayList?*/
package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {5,4,8,9,12};
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("Input : "+list1);
		list1.set(2, 15);
		System.out.println("After adding element at particular index : "+list1);

	}

}
