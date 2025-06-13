package suchita;
// Assignment 48_3

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Assignment48_3 {

	//print all the numbers having freq 1.[Map]
	void getFreq(int arr[]) {
		
		System.out.println("\nGiven array :: "+Arrays.toString(arr));
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : arr)
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		System.out.println("Numbers having frequency 1 :: ");
		for (int key : map.keySet())
			if (map.get(key) == 1)
				System.out.print(key + " \n");

	}

	public static void main(String[] args) {
		
		Assignment48_3 assignment = new Assignment48_3();
		int arr[] = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		assignment.getFreq(arr);
	}
}