package dattaraj;

import java.util.ArrayList;

public class Assignment46_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P2 pgm2 = new Assignment46_P2();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(89);
		aList.add(55);
		aList.add(5);
		aList.add(22);
		aList.add(48);
		aList.add(32);
		aList.add(7);
		aList.add(5);
		
		pgm2.isduplicate(aList,5);
		pgm2.isduplicate(aList,22);
		
		
	}

	private void isduplicate(ArrayList<Integer> aList, int i) {
		// TODO Auto-generated method stub
		if (aList.indexOf(i) != aList.lastIndexOf(i))
			System.out.println(i + " is duplicate in the list");
		else
			System.out.println(i + " is unique in the list");
		
	}

}
