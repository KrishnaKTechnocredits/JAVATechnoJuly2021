/*Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]*/

package astha.Assignment46;

import java.util.ArrayList;

public class Assignment9 {

	ArrayList<Integer> getUnionOfArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2){
		list2.removeAll(list1);
		list1.addAll(list2);
		return list1;
	}
	
	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
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
		System.out.println(assignment9.getUnionOfArrayList(inputList1, inputList2));
	}
}
