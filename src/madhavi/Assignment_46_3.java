package madhavi;

import java.util.ArrayList;
//Write a program to remove duplicate from ArrayList (without using set).

public class Assignment_46_3 {
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
			if (index != intlist.lastIndexOf(num)) {
				intlist.remove(index);
			}
		}

		System.out.print("Present element is in list" + intlist);

	}

}