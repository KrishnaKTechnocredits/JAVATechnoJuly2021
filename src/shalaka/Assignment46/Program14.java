/*Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/
package shalaka.Assignment46;

import java.util.ArrayList;
import java.util.Iterator;

public class Program14 {
	void traverseArraylist(ArrayList<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		System.out.println("Transversing Arraylist by Iterator: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println("\nTransversing Arraylist by enhanced for loop: ");
		for (Integer num : list) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(20);
		list.add(12);
		list.add(13);
		list.add(25);
		list.add(15);
		list.add(20);
		Program14 program14 = new Program14();
		program14.traverseArraylist(list);

	}

}
