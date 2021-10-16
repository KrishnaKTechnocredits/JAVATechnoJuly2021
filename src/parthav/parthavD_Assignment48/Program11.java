/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1 */

package parthav.parthavD_Assignment48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program11 {

	void findDuplicatesUsingArrayList(Integer[] inputArr) {
		int number;
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("The duplicates from the Array using primary ArrayList approach: ");
		for (int index = 0; index < inputArr.length; index++) {
			number = inputArr[index];
			if (list.contains(number))
				System.out.println(number);
			else
				list.add(number);
		}

		/* Alternate approach */
		System.out.println("The duplicates from the Array using alternate ArrayList approach: ");
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(inputArr));
		for (int index = 0; index < list1.size(); index++) {
			int num = list1.get(index);
			if (list1.indexOf(num) != list1.lastIndexOf(num)) {
				if (index != list1.lastIndexOf(num))
					System.out.println(num);
			}

		}

	}

	void findDuplicatesUsingArray(Integer[] inputArr) {
		int count;
		System.out.println("The duplicates from the Array are: ");
		for (int index = 0; index < inputArr.length; index++) {
			count = 0;
			for (int innerIndex = 0; innerIndex < inputArr.length; innerIndex++) {
				if ((inputArr[index] == inputArr[innerIndex]) && (index != innerIndex)) {
					if (inputArr[index] != 0) {
						inputArr[innerIndex] = 0;
						count++;
					}
				}
			}

			if (count > 0 && inputArr[index] != 0)
				System.out.println(inputArr[index]);
		}
	}

	void findDuplicatesUsingSet(Integer[] inputArr) {
		Set<Integer> set = new LinkedHashSet<>();
		System.out.println("The duplicates using Set approach are: ");
		for (int index = 0; index < inputArr.length; index++) {

			if (!set.add(inputArr[index]))
				System.out.println(inputArr[index]);
		}

	}
	
	void findDuplicatesUsingMap(Integer[] inputArr) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		System.out.println("The duplicates using Map approach are: ");
		for (int index = 0; index < inputArr.length;index++) {
			int num = inputArr[index];
			if(!map.containsKey(num))
				map.put(num,1);
			else
				map.put(num, map.get(num) + 1);
		}
		
		Set<Entry<Integer, Integer>> entrSet = map.entrySet();
		Iterator<Entry<Integer, Integer>> itr = entrSet.iterator();
		while(itr.hasNext()) {
			Entry<Integer, Integer> entr = itr.next();
			if (entr.getValue() > 1)
				System.out.println(entr.getKey());
		}
		
	}

	public static void main(String[] args) {
		Integer[] inputArr = { 1, 2, 3, 6, 5, 4, 6, 2 };
		Program11 newObject = new Program11();
		Program11 newObject1 = new Program11();
		Integer[] inputArr1 = { 1, 2, 3, 6, 5, 4, 6, 2 };
		newObject.findDuplicatesUsingArray(inputArr);
		newObject1.findDuplicatesUsingArrayList(inputArr1);
		newObject1.findDuplicatesUsingSet(inputArr1);
		newObject1.findDuplicatesUsingMap(inputArr1);

	}

}
