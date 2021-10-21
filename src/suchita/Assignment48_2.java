package suchita;
// Assignment 48_2

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Assignment48_2 {

	//Find how many pairs of socks we can have from given array.[Map]
	void getPair(int arr[]) {

		System.out.println("\nGiven array :: "+ Arrays.toString(arr));
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int index : arr) {
			if (map.containsKey(index))
				map.put(index, map.get(index) + 1);
			else
				map.put(index, 1);

		}

		for (int key : map.keySet())
			count += map.get(key) / 2;

		System.out.println("Number of pairs :: "+count);

	}

	public static void main(String[] args) {
		
		Assignment48_2 assignment = new Assignment48_2();
		int arr[] = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		assignment.getPair(arr);

	}
}