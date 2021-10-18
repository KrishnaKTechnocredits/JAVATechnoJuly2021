/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map
*/

package astha.Assignment48;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Program3 {

	void printNonRepeatingNumbers(int[] input) {
		HashMap<Integer, Integer> numberFrequencyMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < input.length; index++) {
			if (numberFrequencyMap.containsKey(input[index]))
				numberFrequencyMap.put(input[index], numberFrequencyMap.get(input[index]) + 1);
			else
				numberFrequencyMap.put(input[index], 1);
		}

		// System.out.println(numberFrequencyMap);

		Set<Integer> keySet = numberFrequencyMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		System.out.println("The numbers with frequency 1 are : ");
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			if (numberFrequencyMap.get(key) == 1)
				System.out.println(key);
		}
	}

	public static void main(String[] args) {
		Program3 program3 = new Program3();
		int[] input = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		program3.printNonRepeatingNumbers(input);
	}
}
