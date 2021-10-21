package suchita;
// Assignment 48_7

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Assignment48_7 {

	//Find the freq of each number in given array.
	 void getFreq(int[] arr) {
	 
		System.out.println("\nGiven array :: "+Arrays.toString(arr));
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int temp : arr)
			if (map.containsKey(temp))
				map.put(temp, map.get(temp) + 1);
			else
				map.put(temp, 1);
		System.out.println("Frequency of each number :: " + map);

	}
	
	public static void main(String[] args) {
		
		Assignment48_7 assignment = new Assignment48_7();
		int arr[] = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		assignment.getFreq(arr);
	}
}