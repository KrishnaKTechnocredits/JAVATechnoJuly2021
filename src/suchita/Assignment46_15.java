package suchita;
// Assignment 46_15

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Assignment46_15 {

	//Write a program to traverse(or iterate) HashSet.
	public static void main(String[] args) {
		
		String arr[] = {"techno", "credits", "java", "selenium", "automation"};
		Set<String> set = new HashSet<String>(Arrays.asList(arr));
		System.out.println("\nInput set :: " + set);
		System.out.println("\nElements of set printed using iterator :: ");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");

	}
}