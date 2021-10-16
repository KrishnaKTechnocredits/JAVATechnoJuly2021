package gauravk.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]

 */
public class ReturnUnionOfTwoListsWithoutDuplicates {
	
	LinkedHashSet<Integer> unionOfListsWithoutDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2){
		list1.addAll(list2);
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(list1);
		return lhs;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arl1 = new ArrayList(Arrays.asList(10, 19, 33, 44, 12));
		ArrayList<Integer> arl2 = new ArrayList(Arrays.asList(19, 99, 110, 11,10));
		System.out.println("Input 1 : "+arl1);
		System.out.println("Input 2 : "+arl2);
		System.out.println("Union of two array lists without duplicates is : "+new ReturnUnionOfTwoListsWithoutDuplicates().unionOfListsWithoutDuplicates(arl1, arl2));
	}
}
