/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/
package shalaka.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber {
	void getDuplicateNumber(Integer[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println("Duplicate Numbers:");
		for (int num : arr) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		for (int key : map.keySet()) {
			if (map.get(key) > 1)
				System.out.print(key + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = { 10, 20, 30, 40, 50, 20, 40, 50, 50 };
		DuplicateNumber duplicateNumber = new DuplicateNumber();
		duplicateNumber.getDuplicateNumber(input);
	}

}
