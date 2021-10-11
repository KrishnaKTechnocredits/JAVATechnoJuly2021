package monali.Assignment_48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.
*/
public class Program11 {

	// Option 1 : without Collection -> Array & loop inside loop
	public void findDuplicatesWithoutCollections(Integer inputArrray[]) {

		System.out.println("Duplicate numbers in Array Using Array: ");
		for (int i = 0; i < inputArrray.length; i++) {
			int count = 0;
			for (int j = i + 1; j < inputArrray.length; j++) {
				if (inputArrray[i] == inputArrray[j]) {
					count++;
					inputArrray[j] = -1;
				}
			}
			if (count != 0 && inputArrray[i] != -1) {
				System.out.println(inputArrray[i]);
			}
		}
	}

	// Option 2 : ArrayList : boolean contains()

	void findDuplicateNumberUsingArrayList(Integer[] input) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(input));
		for (int i = 0; i < list.size(); i++) {
			if (list.lastIndexOf(list.get(i)) != list.indexOf(list.get(i))) {
				System.out.println(list.get(i) + " ");
				list.remove(list.get(i));
			}
		}

	}

	// Option 3 : Set : boolean add()
	void getDuplicateNumUsingSet(Integer arr[]) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> output = new HashSet<>();

		for (int number : arr) {
			if (!set.add(number)) {
				output.add(number);
			}
		}
		System.out.println("Using set : " + output);
	}

	// /Option 4 : Map : value gr8 than 1.
	void getDuplicateNumberUsingMap(Integer arr[]) {
		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int num : arr) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		for (int key : map.keySet()) {
			if (map.get(key) > 1)
				System.out.println(key + ":" + map.get(key));
		}

	}

	public static void main(String[] args) {
		Integer arr[] = { 10, 30, 400, 500, 10, 70, 30, 501, 401 };
		Program11 p11 = new Program11();
		System.out.println("Input Array" + Arrays.toString(arr));
		// p11.findDuplicatesWithoutCollections(arr);
		p11.findDuplicateNumberUsingArrayList(arr);
		p11.getDuplicateNumUsingSet(arr);
		p11.getDuplicateNumberUsingMap(arr);
	}
}
