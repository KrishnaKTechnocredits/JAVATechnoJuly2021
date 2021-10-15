/*Example 2 :
Write a program to find given number is duplicate in arrayList.*/
package shalaka.Assignment46;

import java.util.ArrayList;

public class Program2 {
	void getDuplicateNum(ArrayList<Integer> list, int num) {
		if (list.indexOf(num) != list.lastIndexOf(num)) {
			System.out.println(num + " Number is Duplicate");
		} else {
			System.out.println(num + " Number is not Duplicate");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(200);
		list.add(300);
		list.add(100);
		Program2 program2 = new Program2();
		program2.getDuplicateNum(list, 200);
		program2.getDuplicateNum(list, 10);

	}

}
