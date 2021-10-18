package dattaraj;

import java.util.ArrayList;

public class Assignment46_P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P9 pgm9 = new Assignment46_P9();
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
		System.out.println(pgm9.getUnionOfArrayList(inputList1, inputList2));
	}

	ArrayList<Integer> getUnionOfArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2){
		list2.removeAll(list1);
		list1.addAll(list2);
		return list1;
	}

}
