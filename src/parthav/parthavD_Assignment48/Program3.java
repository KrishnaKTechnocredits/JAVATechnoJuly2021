/* Assignment - 48 : 9th Oct'2021
 * program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9*/

package parthav.parthavD_Assignment48;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Program3 {

	void printFrequency(Integer[] inputArr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int index = 0; index < inputArr.length; index++) {
			Integer value = inputArr[index];
			if (!map.containsKey(value))
				map.put(value, 1);
			else
				map.put(value, map.get(value) + 1);
		}

		Set<Entry<Integer, Integer>> entrSet = map.entrySet();
		Iterator<Entry<Integer, Integer>> itr = entrSet.iterator();

		System.out.println("The numbers with frequencey 1 are: ");

		while (itr.hasNext()) {
			Entry<Integer, Integer> entr = itr.next();
			if (entr.getValue() == 1)
				System.out.println(entr.getKey());
		}

	}

	public static void main(String[] args) {
		Program3 newObj = new Program3();
		Integer[] inputArr = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		newObj.printFrequency(inputArr);

	}

}
