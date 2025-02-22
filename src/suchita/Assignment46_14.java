package suchita;
// Assignment 46_14

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Assignment46_14 {

	//Write a program to convert Array to List.
	public static void main(String[] args) {
		
		String arr[] = {"techno", "credits", "java", "selenium", "automation"};
		List<String> list1 = new ArrayList<String>();
		System.out.println("\nInput array ::" + Arrays.toString(arr));
		list1.addAll(Arrays.asList(arr));
		System.out.println("\nPrinting list after moving array elements to List using 'addAll' :: \n" + list1);

		List<String> list2 = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("\nPrinting list after moving array elements to List by passing arr in 'ArrayList constructor' ::\n" + list2);

		List<String> list3 = Arrays.asList(arr);
		System.out.println("\nPrinting list after moving array elements to List by passing arr in 'Arrays.asList'  :: \n" + list3);



	}
}