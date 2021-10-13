
/*Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]*/
package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;

public class Program9 {
	

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(10, 19, 33, 44, 12));
		int[] arr2= {19, 99, 110, 11,10};
		ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(19, 99, 110, 11,10));
		list2.removeAll(list1);
		list1.addAll(list2);
		System.out.println("Union of two ArrayList without duplicates is : "+list1);
	}

}
