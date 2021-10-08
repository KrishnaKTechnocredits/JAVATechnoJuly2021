/*Example 3 :
Write a program to remove duplicate from ArrayList (without using set).*/
package shalaka.Assignment46;

import java.util.ArrayList;

public class Program3 {
	void removeDuplicateNum(ArrayList<Integer> input) {
		for (int index = 0; index < input.size(); index++) {
			if (input.indexOf(input.get(index)) != input.lastIndexOf(input.get(index))) {
				input.remove(input.get(index));
			}
		}
		System.out.println("Arraylist after removing duplicates: " + input);
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
		Program3 program3 = new Program3();
		program3.removeDuplicateNum(list);

	}

}
