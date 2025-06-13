package suchita;
//Assignment 48_10

import java.util.ArrayList;
import java.util.Arrays;

class Assignment48_10 {
	
	//Append 0 after 3 consecutive number.
	void appendZero(Integer arr[]) {
		
		System.out.println("\n Given array :: "+Arrays.toString(arr));
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

		for(int index = 0; index < list.size()-2; index++)
			if(list.get(index)+1 == list.get(index+1) && list.get(index+1)+1 == list.get(index+2))
				list.add(index+3, 0);

		System.out.println(list);
	}

	public static void main(String[] args) {
		
		Assignment48_10 assignment = new Assignment48_10();
		Integer arr[] = {1,2,3,5,4,7};
		assignment.appendZero(arr);
	}

}