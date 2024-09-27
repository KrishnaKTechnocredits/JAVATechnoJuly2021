/*find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/

package suruchi.Assignment48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program11 {

	void findDuplicatesUsingArrayList(Integer[] input) {
		System.out.println("The duplicates using List approach are: ");
		List<Integer> list = new ArrayList<>();

		for (int num : input) {
			if (list.contains(num))
				System.out.println(num);
			else
				list.add(num);
		}
	}

	void findDuplicatesUsingSet(Integer[] input) {
		Set<Integer> set = new LinkedHashSet<>();
		System.out.println("The duplicates using Set approach are: ");
		for (int index = 0; index < input.length; index++) {

			if (!set.add(input[index]))
				System.out.println(input[index]);
		}
	}

	void findDuplicatesUsingMap(Integer[] input) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		System.out.println("The duplicates using Map approach are: ");
		for (int index = 0; index < input.length; index++) {
			int num = input[index];
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		Iterator<Entry<Integer, Integer>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Entry<Integer, Integer> entry = itr.next();
			if (entry.getValue() > 1)
				System.out.println(entry.getKey());
		}
	}

	public static void main(String[] args) {
		Program11 program11 = new Program11();

		Integer[] input = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };

		System.out.println("Array is: " + Arrays.toString(input));
		program11.findDuplicatesUsingArrayList(input);
		program11.findDuplicatesUsingSet(input);
		program11.findDuplicatesUsingMap(input);
	}
}