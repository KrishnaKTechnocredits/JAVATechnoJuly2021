/*Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]*/
		
package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Program_9 {

	
	public static void main(String[] args) {
		Integer[] input1 = { 10, 19, 33, 44, 12};
		Integer[] input2 = { 19, 99, 110, 11,10};
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(input1));
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>(Arrays.asList(input2));
		arrayList2.removeAll(arrayList1);
		arrayList1.addAll(arrayList2);
		System.out.println(arrayList1);
	}
}
