package aniket;

import java.util.ArrayList;

//Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).
public class Assignment_46_17 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(100);
		list.add(15);
		list.add(20);
		list.add(45);
		list.add(85);
		System.out.println(list);
		list.remove(new Integer(100));
		list.remove(new Integer(85));
		System.out.println("After removing objects : " + list);
		
		
	}
	
}

