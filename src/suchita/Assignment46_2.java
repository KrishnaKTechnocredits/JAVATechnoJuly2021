package suchita;
//Assignment 46_2


import java.util.ArrayList;
import java.util.Arrays;

class Assignment46_2 {

	//WAP to find given number is duplicate in arrayList.
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(10, 21, 12, 9, 43, 35, 12, 99, 53));
		System.out.println("\n Arraylist :: " + arr);
		System.out.println(" Duplicate number :: ");
		
		for (int index = 0; index < arr.size(); index++)
			if (arr.indexOf(arr.get(index)) != arr.lastIndexOf(arr.get(index)))
				if (arr.indexOf(arr.get(index)) != index)
					System.out.println("\t"+ arr.get(index));
	}
}