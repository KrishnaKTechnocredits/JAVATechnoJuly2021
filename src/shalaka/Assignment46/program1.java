/*Programming Questions - Collections : 4th Oct'2021

Example 1 : 
Write a program to find given number is present in the arrayList or not.*/
package shalaka.Assignment46;

import java.util.ArrayList;

public class program1 {
	void isNumberPresent(ArrayList<Integer> list, int num) {
		if (list.contains(num)) {
			System.out.println(num + " Number is found");
		} else {
			System.out.println(num + " Number is not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(250);
		list.add(400);
		list.add(550);
		program1 program1 = new program1();
		program1.isNumberPresent(list, 200);
		program1.isNumberPresent(list, 10);
		// System.out.println(list.contains(200));
		/// System.out.println(list.contains(10));
	}

}
