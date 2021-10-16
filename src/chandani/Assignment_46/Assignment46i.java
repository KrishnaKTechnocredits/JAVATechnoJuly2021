/*Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]*/
package chandani.Assignment_46;

import java.util.Arrays;
import java.util.LinkedList;

public class Assignment46i {
	
	public static void main(String[] args) {

		Integer[] arr1 = {10, 19, 33, 44, 12};
		Integer[] arr2 = { 19, 99, 110, 11,10};
		System.out.println("arr 1 : "+Arrays.toString(arr1));
		System.out.println("arr 2 : "+Arrays.toString(arr2));
		
		LinkedList<Integer> al1 = new LinkedList<Integer>(Arrays.asList(arr1));
		LinkedList<Integer> al2 = new LinkedList<Integer>(Arrays.asList(arr2));
		al2.removeAll(al1);
		al1.addAll(al2);
		
		System.out.println("------------------------------------");
		System.out.println("Output : "+al1);
	}
}
