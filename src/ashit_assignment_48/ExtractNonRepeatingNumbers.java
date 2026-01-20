/*
 * Assignment - 48 : 9th Oct'2021
program 3: 
print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map
-----------------------
 */
package ashit_assignment_48;

import java.util.HashMap;
import java.util.Set;


public class ExtractNonRepeatingNumbers {
	public static void main(String[] args) {
		Integer[] numbers = {1,11,33,22,22,11,1,9,7,7};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for(Integer i:numbers) {
			if(hm.containsKey(i))
				hm.put(i, hm.get(i)+1);
			else hm.put(i, 1);
		}

		System.out.println(hm);

		Set<Integer> keys = hm.keySet();
		for(int key:keys) {
			if(hm.get(key)==1)
				System.out.println(key+" ");
		}
	}
}
