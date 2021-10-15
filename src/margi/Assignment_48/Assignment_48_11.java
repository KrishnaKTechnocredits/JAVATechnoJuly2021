package margi.Assignment_48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/

public class Assignment_48_11 {

	// without collection -> Array & loop inside loop
	void getDuplicateWithoutCollection(Integer[] input) {
		String output = "";
		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex]) {
					output += input[index] + " ";
					break;
				}
			}
		}
		System.out.println(output);
	}

	// ArrayList : boolean contains()
	void getDuplicateWithArrayList(Integer[] input) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(input));
		ArrayList<Integer> output = new ArrayList<>();
		for (int num : list) {
			if (!output.contains(num) && (list.indexOf(num) != list.lastIndexOf(num))) {
				output.add(num);
			}
		}
		System.out.println(output);
	}

	// Set : boolean add()
	void getDuplicatesWithSet(Integer[] input) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> output = new HashSet<>();
		for (int num : input) {
			if (!set.add(num))
				output.add(num);
		}
		System.out.println(output);
	}

	// Map : value gr8 than 1
	void getDuplicatesWithMap(Integer[] input) {
		HashMap<Integer, Integer> map = new HashMap<>();
		String output = "";
		for (int num : input) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		for (int num : map.keySet()) {
			if (map.get(num) > 1)
				output += num + " ";
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		Integer[] arr = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		Assignment_48_11 assignment_48_11 = new Assignment_48_11();
		System.out.println("Duplicates without using collection: ");
		assignment_48_11.getDuplicateWithoutCollection(arr);
		System.out.println("Duplicates using ArrayList: ");
		assignment_48_11.getDuplicateWithArrayList(arr);
		System.out.println("Duplicates using Set: ");
		assignment_48_11.getDuplicatesWithSet(arr);
		System.out.println("Duplicates using Map: ");
		assignment_48_11.getDuplicatesWithMap(arr);
	}
}
