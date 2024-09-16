package dattaraj;

import java.util.ArrayList;

public class Assignment46_P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P10 pgm10 = new Assignment46_P10();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(3);
		list.add(10);
		System.out.println(pgm10.getMissingNumber(list));
	}

	ArrayList<Integer> getMissingNumber(ArrayList<Integer> list){
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int index=1; index<=10; index++) {
			if(!list.contains(index))
				output.add(index);
		}
		return output;
	}
}
