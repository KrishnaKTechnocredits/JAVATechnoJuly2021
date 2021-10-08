/*Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/
/*removeDuplicateNumUsingSet*/
package shalaka.Assignment46;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Program4 {
	void removeDuplicateNumUsingSet(ArrayList<Integer> list) {
		LinkedHashSet<Integer> setList = new LinkedHashSet<>(list);
		System.out.println("Arraylist After removing duplicates: " + setList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(150);
		list.add(300);
		list.add(200);
		list.add(300);
		list.add(100);
		list.add(250);
		list.add(150);
		System.out.println("Arraylist: " + list);
		Program4 program4 = new Program4();
		program4.removeDuplicateNumUsingSet(list);
	}

}
