/*
 * program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
output : 33,9
Hint : Map

 */
package husain.Assignment48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program3 {

	void findFreq(int arr[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : arr)
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		System.out
				.println("The list of numbers having frequency 1 in the given array " + Arrays.toString(arr) + " is ");
		for (int key : map.keySet())
			if (map.get(key) == 1)
				System.out.print(key + " ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		Program3 obj = new Program3();
		obj.findFreq(arr);
	}

}
