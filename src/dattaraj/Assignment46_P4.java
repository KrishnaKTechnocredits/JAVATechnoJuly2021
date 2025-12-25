package dattaraj;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Assignment46_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P4 pgm4 = new Assignment46_P4();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(89);
		aList.add(55);
		aList.add(5);
		aList.add(22);
		aList.add(48);
		aList.add(32);
		aList.add(7);
		aList.add(5);
		aList.add(87);
		
		System.out.println("Before Removing " + aList);
		
		pgm4.removeDuplicateSet(aList);
	}

	private void removeDuplicateSet(ArrayList<Integer> aList) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>(aList);
		System.out.println("List after removing the duplicate values : " +list);
	}

}
