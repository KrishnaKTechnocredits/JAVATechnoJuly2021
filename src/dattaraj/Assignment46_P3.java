package dattaraj;

import java.util.ArrayList;

public class Assignment46_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P3 pgm3 = new Assignment46_P3();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(89);
		aList.add(55);
		aList.add(5);
		aList.add(22);
		aList.add(48);
		aList.add(32);
		aList.add(7);
		aList.add(5);
		
		System.out.println("Before Removing " + aList);
		
		pgm3.removeDuplicate(aList,5);

	}

	private void removeDuplicate(ArrayList<Integer> aList, int i) {
		// TODO Auto-generated method stub
		for(int index=0; index<aList.size();index++) {
			if(aList.contains(i)) {
				if (aList.indexOf(i) != aList.lastIndexOf(i))
					aList.remove(aList.indexOf(i));
			}else {
				System.out.println(i + " is Not Present.");
			}
		}
		
		System.out.println("After Removing "  + aList);	
		
	}

}
