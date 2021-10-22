package suchita;
//Assignemt 46_1

import java.util.ArrayList;
import java.util.Arrays;

class Assignment46_1 {

	//WAP to find given number is present in the arrayList or not.
	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(10, 21, 9, 43, 35, 12, 99, 53));
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(5, 43, 19, 37, 21, 112, 9, 52));
		
		System.out.println(" Arraylist1 :: " + arr1);
		System.out.println(" Arraylist2 :: " + arr2);
		System.out.println(" Numbers present :: ");
		for(int num : arr2)
			if(arr1.contains(num))
				System.out.println(num);
	}

}