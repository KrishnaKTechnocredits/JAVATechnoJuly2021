/*
 *Example 15:
Write a program to convert Array to List.
 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"techno", "credits", "java", "selenium", "automation"};
		List<String> list = new ArrayList<String>();
		System.out.println("Input array " + Arrays.toString(arr));
		list.addAll(Arrays.asList(arr));
		System.out.println("Printing list after moving array elements to List using addAll" + list);
		
		String arr1[] = {"techno", "credits", "java", "selenium", "automation"};
		List<String> list1 = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("\nInput array " + Arrays.toString(arr));
		System.out.println("Printing list after moving array elements to List by passing arr in ArrayList constructor" + list1);
		
		String arr2[] = {"techno", "credits", "java", "selenium", "automation"};
		List<String> list2 = Arrays.asList(arr);
		System.out.println("\nInput array " + Arrays.toString(arr));
		System.out.println("Printing list after moving array elements to List by passing arr in Arrays.asList to get read only List" + list2);
		
				

	}

}
