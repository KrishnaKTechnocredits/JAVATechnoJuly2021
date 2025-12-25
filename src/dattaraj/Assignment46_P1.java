package dattaraj;

import java.util.ArrayList;

public class Assignment46_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P1 pgm1 = new Assignment46_P1();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(89);
		aList.add(55);
		aList.add(5);
		aList.add(22);
		aList.add(48);
		aList.add(32);
		aList.add(7);
		
		pgm1.isFromArrayL(aList,48);
		pgm1.isFromArrayL(aList,77);
		
	}

	private void isFromArrayL(ArrayList<Integer> aList, int i) {
		// TODO Auto-generated method stub
		if(aList.contains(i)) {
			System.out.println(i + " is Present.");
		}else {
			System.out.println(i + " is Not Present.");
		}
	}

}
