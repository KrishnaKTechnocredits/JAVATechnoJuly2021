/*
 *Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]

 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Program9 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 19, 33, 44, 12));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(19, 99, 110, 11,10));
		System.out.println("List 1" + list1);
		System.out.println("List 2" + list2);
		list2.removeAll(list1);
		list1.addAll(list2);
		
		System.out.println("Output list containing union of list1 and list2 minus the duplicates " + list1);
		
	}

}
