/*Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]*/
package indu.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;


public class UnionOfTwoArrayWithoutDuplicates_9 {

	public static void main(String[] args)
	{
		ArrayList<Integer> alist1 = new ArrayList<>(Arrays.asList(10, 19, 33, 44, 12));
		ArrayList<Integer> alist2 = new ArrayList<>(Arrays.asList(19, 99, 110, 11,10));
		System.out.println("Input list 1 : "+alist1+"\nInput list 2 : "+alist2);
		alist2.removeAll(alist1);
		alist1.addAll(alist2);
		System.out.println("Union of two list after removing duplicates \n"+alist1);
		
		
	}
}
