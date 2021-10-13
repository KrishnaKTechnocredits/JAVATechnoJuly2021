/*Program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello*/

package parthav.parthavD_Assignment48;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;

public class Program9 {

	void findFirstNonRepeatingWord(String str){
		String[] arr = str.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();
		
		for (String word: arr){
			if (!map.containsKey(word))
				map.put(word, 1);
			else
				map.put(word, map.get(word) + 1);
		}
		
		Set<Entry<String, Integer>> entrSet = map.entrySet();
		Iterator<Entry<String, Integer>> itr = entrSet.iterator();
		
		System.out.println("The first non-repeating word in the given string is: ");
		while(itr.hasNext()){
			Entry<String, Integer> entr = itr.next();
			if (entr.getValue() == 1){
				System.out.println(entr.getKey());
				break;
			}
		}
	}

	public static void main(String[] args) {
		Program9 newObj = new Program9();
		String str = "Hi Hello Hi Techno Credits Hi Credits";
		newObj.findFirstNonRepeatingWord(str);

	}

}
