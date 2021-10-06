package suchita;

//Assignment 44

import java.util.ArrayList;

class Assignment44 {

	//Find out the max number from an arraylist.
	
	void getMaxnumber(ArrayList<Integer> arr) {
	
		int max = arr.get(0);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > max) {
				max = arr.get(i);
			}
		}
		System.out.println("Max number from the given ArrayList :: " + max);
	}

	public static void main(String[] args) {
	
		Assignment44 assignment = new Assignment44();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(7);
		arr.add(99);
		arr.add(53);
		arr.add(74);
		assignment.getMaxnumber(arr);
	}

}
