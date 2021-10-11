/*
 * Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map

if(hm.containsKey(key))
	hm.put(key, hm.get(key)+1);
else
	hm.put(key,1);

 */
package husain.Assignment48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program2 {

	void findPair(int arr[]) {

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

		System.out.println("The total number of pairs in the given array "+Arrays.toString(arr)+" is "+count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		Program2 obj = new Program2();
		obj.findPair(arr);

	}

}
