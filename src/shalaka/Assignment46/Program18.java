/*Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).*/
package shalaka.Assignment46;

import java.util.ArrayList;

public class Program18 {
	void removeObjectFromArrayList(ArrayList<Integer> list, Integer num) {
		System.out.println("Input list" + list);
		if (list.contains(num)) {
			list.remove(num);
			System.out.println("ArrayList after removing given object: " + list);
		} else
			System.out.println("element is not present");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(13);
		list.add(12);
		list.add(11);
		list.add(20);
		Program18 program18 = new Program18();
		program18.removeObjectFromArrayList(list, 13);
	}

}
