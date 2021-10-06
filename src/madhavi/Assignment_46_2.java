package madhavi;

import java.util.ArrayList;

//Write a program to find given number is duplicate in arrayList..
public class Assignment_46_2 {
	public static void main(String[] args) {
		System.out.println("Find number is duplicate in arrayList");
		System.out.println("--------------------------------------------------");
		ArrayList<Integer> intlist = new ArrayList<>();
		intlist.add(10);
		intlist.add(100);
		intlist.add(20);
		intlist.add(200);
		intlist.add(50);
		intlist.add(200);
		intlist.add(100);
		intlist.add(500);
		System.out.println("An initial list of elements: " + intlist);
		// ArrayList<Integer> list = new ArrayList<>();
		for (int index = 0; index < intlist.size(); index++) {
			int num = intlist.get(index);
			if (intlist.indexOf(num) != intlist.lastIndexOf(num)) {
				if (index == intlist.indexOf(num)) {
					System.out.println("Duplicate number is " + num);
				}
			}
		}
	}
}