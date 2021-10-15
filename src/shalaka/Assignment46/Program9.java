/*
Example 9 : 
Write a program to return Union of two ArrayList without duplicates.*/
package shalaka.Assignment46;

import java.util.ArrayList;

public class Program9 {
	ArrayList<Integer> getUnionOfList(ArrayList<Integer> list, ArrayList<Integer> list1) {
		list1.removeAll(list);
		list.addAll(list1);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list.add(10);
		list.add(25);
		list.add(35);
		list.add(50);
		list.add(11);
		list1.add(35);
		list1.add(10);
		list1.add(88);
		list1.add(90);

		Program9 program9 = new Program9();
		System.out.println("Union of two ArrayList without duplicates: " + program9.getUnionOfList(list, list1));
	}

}
