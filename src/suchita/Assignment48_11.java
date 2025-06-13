package suchita;
// Assignment 48_11

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Assignment48_11 {

	//find duplicate from array.
	//Option 1 : without Collection -> Array & loop inside loop
	void findDuplicateWithoutColl(String str, int arr[]) {

		String output[] = str.split(" ");

		System.out.println("\nGiven String:: " + str );
		System.out.println("Duplicates using array loop ::\t \t ");
		for (int index = 0; index < output.length; index++) {
			if (output[index] != null)
				for (int innerIndex = index + 1; innerIndex < output.length; innerIndex++)
					if (output[index].equals(output[innerIndex])) {
						System.out.println(output[index]);
						output[innerIndex] = null;
						break;
					}
		}
		System.out.println("\nGiven Array :: " + Arrays.toString(arr));
		System.out.println("Duplicates using array loop :: ");
		for (int index = 0; index < arr.length; index++)
			if (arr[index] != 0)
				for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++)
					if (arr[index] == arr[innerIndex]) {
						System.out.println(arr[index]);
						arr[innerIndex] = 0;
						break;
					}

	}
	
	//Option 2 : ArrayList : boolean contains()
	void findDuplicateUsingArrayList(String str, int arr[]) {
		String output[] = str.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(output));
		System.out.println("\nGiven Sring :: " + str );
		System.out.println("Duplicates using ArrayList :: ");
		for (String temp : output) {
			int count = 0;
			String str1 = "";
			while (list.contains(temp)) {
				list.remove(temp);
				str1 = temp;
				count++;
			}
			if (count > 1)
				System.out.println(str1);
		}

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		for (int num : arr)
			list1.add(num);
		System.out.println("\nGiven Array :: " + Arrays.toString(arr));
		System.out.println("Duplicates using arrayList :: ");
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			int num1 = 0;
			while (list1.contains(arr[index])) {
				list1.remove(new Integer(arr[index]));
				num1 = arr[index];
				count++;
			}
			if (count > 1)
				System.out.println(num1);
		}

	}

	
	
	//Option 3 : Set : boolean add()
	void findDuplicateUsingSet(String str, int arr[]) {
		String output[] = str.split(" ");
		String str1 = "";
		Set<String> set = new HashSet<String>();
		
		System.out.println("\nGiven String :: " + str );
		System.out.println("Duplicates using Set :: ");

		for (String temp : output) {
			if (!set.add(temp)) {
				System.out.println(temp);

			}
		}

		System.out.println("\nGiven Array :: " + Arrays.toString(arr) );
		System.out.println("Duplicates using Set :: ");
		Set<Integer> set1 = new HashSet<Integer>();
		for (int num : arr)
			if (!set1.add(num))
				System.out.println(num);
	}
	
	//Option 4 : Map : value greater than 1.
	void findDuplicateUsingMap(String str, int arr[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String output[] = str.split(" ");
		System.out.println("\nGiven String :: " + str );
		System.out.println("Duplicates using Map :: ");
		
		for (String temp : output)
			if (map.containsKey(temp))
				map.put(temp, map.get(temp) + 1);
			else
				map.put(temp, 1);

		for (String key : map.keySet())
			if (map.get(key) > 1)
				System.out.println(key);

		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		System.out.println("\nGiven Array :: " + Arrays.toString(arr) );
		System.out.println("Duplicates using Map :: ");
		for (int num : arr)
			if (map1.containsKey(num))
				map1.put(num, map1.get(num) + 1);
			else
				map1.put(num, 1);

		for (int key : map1.keySet())
			if (map1.get(key) > 1)
				System.out.println(key);
	}

	public static void main(String[] args) {
		
		String str = "Hi Hello Hi Techno Credits Credits Hi Credits";
		int arr[] = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7};
		Assignment48_11 assignment1 = new Assignment48_11();
		assignment1.findDuplicateWithoutColl(str, arr);
		Assignment48_11 assignment2 = new Assignment48_11();
		assignment2.findDuplicateUsingArrayList(str, arr);
		Assignment48_11 assignment3 = new Assignment48_11();
		assignment3.findDuplicateUsingSet(str, arr);
		Assignment48_11 assignment4 = new Assignment48_11();
		assignment4.findDuplicateUsingMap(str, arr);
		
		
		

	}
}