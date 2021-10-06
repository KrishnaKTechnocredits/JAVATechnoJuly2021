package margi.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

/*Write a program to return Union of two ArrayList without duplicates.
input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]*/

public class Assignment_46_9 {

	void getUnion(Integer[] input1, Integer[] input2) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(input1));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(input2));
		list2.removeAll(list1);
		list1.addAll(list2);
		System.out.println(list1);
	}

	public static void main(String[] args) {
		Assignment_46_9 assignment_46_9 = new Assignment_46_9();
		Integer[] input1 = { 10, 19, 33, 44, 12 };
		Integer[] input2 = { 19, 99, 110, 11, 10 };
		assignment_46_9.getUnion(input1, input2);
	}
}
