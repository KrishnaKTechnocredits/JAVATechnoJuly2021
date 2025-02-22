package suchita;
//Assignment 46_3


import java.util.ArrayList;
import java.util.Arrays;

class Assignment46_3 {

	//WAP to remove duplicate from ArrayList (without using set).
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(10, 21, 12, 9, 43, 35, 12, 99, 21, 53));
		System.out.println(" \nInput arraylist:: " + arr);

		for (int index = 0; index < arr.size(); index++)
			if (arr.indexOf(arr.get(index)) != arr.lastIndexOf(arr.get(index)))
				if (arr.indexOf(arr.get(index)) != index)
					arr.remove(index);

		System.out.println(" Duplicates removed:: "+ arr);

	}
}