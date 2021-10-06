/*
 *Example 17:
Write a program to add element at particular index of ArrayList?

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

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"techno", "credits", "java", "selenium", "automation"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Input list " + list);
		list.add(3, "Collections");
		System.out.println("Updated list after adding new element at index 3 " + list);
		list.set(2, "polymorphism");
		System.out.println("Updated list after updating element at index 2 " + list);
	}

}
