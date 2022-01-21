/*Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]*/

package suruchi.Assignment46;

import java.util.ArrayList;

public class Program9 {

	ArrayList<Integer> getUnionOfArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		list2.removeAll(list1);
		list1.addAll(list2);
		return list1;
	}

	public static void main(String[] args) {
		Program9 program9 = new Program9();

		ArrayList<Integer> inputList1 = new ArrayList<Integer>();
		ArrayList<Integer> inputList2 = new ArrayList<Integer>();
		inputList1.add(10);
		inputList1.add(19);
		inputList1.add(33);
		inputList1.add(44);
		inputList1.add(12);
		inputList2.add(19);
		inputList2.add(99);
		inputList2.add(110);
		inputList2.add(11);
		inputList2.add(10);

		System.out.println("Arraylist1 is: " + inputList1);
		System.out.println("Arraylist2 is: " + inputList2);
		System.out.println("Union of 2 arraylists without duplicates is : "
				+ program9.getUnionOfArrayList(inputList1, inputList2));
	}
}