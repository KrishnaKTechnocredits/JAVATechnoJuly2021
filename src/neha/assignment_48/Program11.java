package neha.assignment_48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/
public class Program11 {
	void findDuplicateUsingArrays(int[] arr) {
		System.out.println("Duplicate Numbers found using array and loop: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

	void findDuplicateUsingArrayList(int[] numArr) {
		System.out.println("Duplicate Numbers found using array list: ");
		int numLength = numArr.length;
		Integer[] arr = new Integer[numLength];
		for (int x = 0; x < numLength; x++) {
			arr[x] = new Integer(numArr[x]);
		}
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		for (int i = 0; i < al.size(); i++) {
			if (al.indexOf(al.get(i)) != al.lastIndexOf(al.get(i))) {
				if (i == al.indexOf(al.get(i)))
					System.out.print(al.get(i) + " ");
			}
		}
		System.out.println();
	}

	void findDuplicateUsingSet(int[] numArr) {
		System.out.println("Duplicate Numbers found using set: ");
		int numLength = numArr.length;
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		for (int x = 0; x < numLength; x++) {
			if (hs.add(new Integer(numArr[x])) == false)
				System.out.print(numArr[x] + " ");
		}
		System.out.println();

	}

	void findDuplicateUsingMap(int[] numArr) {
		int numLength = numArr.length;
		Integer[] arr = new Integer[numLength];
		for (int x = 0; x < numLength; x++) {
			arr[x] = new Integer(numArr[x]);
		}
		System.out.println("Duplicate Numbers found using map: ");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int number : arr) {
			if (map.containsKey(number)) {
				int count = map.get(number);
				map.put(number, count + 1);
			} else
				map.put(number, 1);
		}
		for (int dup : map.keySet()) {
			if (map.get(dup) > 1)
				System.out.print(dup + " ");
		}

	}

	public static void main(String[] args) {
		Program11 program11 = new Program11();
		int[] input = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		program11.findDuplicateUsingArrays(input);
		program11.findDuplicateUsingArrayList(input);
		program11.findDuplicateUsingSet(input);
		program11.findDuplicateUsingMap(input);
	}
}
