package aniket;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*Write a program to return Union of two ArrayList without duplicates. 
input 1: [10, 19, 33, 44, 12] input 2 : [19, 99, 110, 11,10] 
output : [10,19,33,44,12,99,110,11] */
public class Assignment_46_9 {
	
	void getUnion(Integer[] input1,Integer[] input2) {
		Set<Integer> list1 = new LinkedHashSet(Arrays.asList(input1));
		Set<Integer> list2 = new LinkedHashSet(Arrays.asList(input2));;
		list1.addAll(list2);
		System.out.println("The union of two arraylist is : " + list1);
		
		
	}
	
	public static void main(String[] args) {
		
		Integer[] input1 = {10, 19, 33, 44, 12};
		Integer[] input2 = {10,19,33,44,12,99,110,11};
		Assignment_46_9 assignment_47_9 = new Assignment_46_9();
		assignment_47_9.getUnion(input1, input2);
	}
}
