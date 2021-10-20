/* program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2 */

package harshada.Assignment48;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class P8_WordWithSecondHighestFreq {

	void findWordWithSecondHighestFreq(String input) {

		HashMap<String, Integer> map = new LinkedHashMap(); //use linkeHM 
		int secMaxFreq = 0; String secMaxFreqWord = " ";
		String maxWord = " "; int maxFreq = 0;
		
		String arr[] = input.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else
				map.put(str, 1);
		}
		
		System.out.println("Map Contents are : " + map);

		for (String key : map.keySet()) {
			int freq = map.get(key);
			if (freq > maxFreq) {
				secMaxFreq = maxFreq;
				secMaxFreqWord = maxWord;
				maxFreq = freq;
				maxWord = key;
			} else {
				secMaxFreq = freq;
				secMaxFreqWord = key;

			}
		}
		System.out.println("The word with second highest freq is: " + secMaxFreqWord + "->" + secMaxFreq);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P8_WordWithSecondHighestFreq obj = new P8_WordWithSecondHighestFreq();
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		obj.findWordWithSecondHighestFreq(input);
	}

}
