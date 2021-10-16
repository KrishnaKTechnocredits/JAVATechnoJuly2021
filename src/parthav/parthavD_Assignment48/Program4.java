/*Assignment - 48 : 9th Oct'2021
 * Program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/

package parthav.parthavD_Assignment48;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;

public class Program4 {

	void printFrequencyOfDuplicateWords(String inputStr){
		String[] inputStrArray = inputStr.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String str: inputStrArray){
			if(!map.containsKey(str))
				map.put(str, 1);
			else
				map.put(str, map.get(str) + 1);
		}
		
		Set<Entry<String, Integer>> entrSet = map.entrySet();
		Iterator<Entry<String, Integer>> itr = entrSet.iterator();
		
		while(itr.hasNext()){
			Entry<String, Integer> entr = itr.next();
			if (entr.getValue() > 1){
				System.out.println(entr.getKey() + " : " + entr.getValue());
			}
		}
		
	}

	public static void main(String[] args) {
		Program4 newObj = new Program4();
		String inputStr = "Hi Hello Hi Techno Credits Credits Hi Credits";
		newObj.printFrequencyOfDuplicateWords(inputStr);

	}

}
