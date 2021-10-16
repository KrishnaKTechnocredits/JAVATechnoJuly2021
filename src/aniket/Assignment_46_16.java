package aniket;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Example 17: Write a program to add element at particular index of ArrayList?
public class Assignment_46_16 {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Aniket");
		list.add("MSD");
		list.add("Virat");
		list.add("Rohit");
		list.add("Aniket");
		
		list.add(2, "Manisha");
		System.out.println(list);
		
	
		
	}
}
