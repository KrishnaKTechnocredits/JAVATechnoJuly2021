package chandani.Assignment_47;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Assignment47b {

	public static void main(String[] args) {
		
		String str = "hi good morning hello good morning";
		String[] arr = str.split(" ");
		HashMap<String, Integer> wordCountMap = new LinkedHashMap<String, Integer>();

		for(int index=0; index<arr.length; index++) {
			String str1 = arr[index];
			if(wordCountMap.containsKey(str1)) {
				int count = wordCountMap.get(str1);
				wordCountMap.put(str1, count+1);
			}
			else {
				wordCountMap.put(str1, 1);
			}
		}
	    // Printing the wordCountMap
	    System.out.println("Frequency of each word from string " + str + " is "+ wordCountMap);		
	}	
}
