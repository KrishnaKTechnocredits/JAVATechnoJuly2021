package suchita;
// Assignment 46_10

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

class Assignment46_10 {

	//Find missing number in a range [1-10] from given ArrayList.
	public static void main(String[] args) {
		// 
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,6,2,5,7,6,3,10));
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("\nList :: " + list1);
		for(int index = 1; index <=10; index++)
			if(!list1.contains(index))
				list2.add(index);
		System.out.println("Output list containing numbers missing betwen 1 to 10 in list :: " + list2);

	}
}