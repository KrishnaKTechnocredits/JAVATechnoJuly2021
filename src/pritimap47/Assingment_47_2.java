package pritimap47;

import java.util.Arrays;
import java.util.HashMap;

public class Assingment_47_2 {
	
	
	HashMap<String, Integer> getFreqOfEachWaord(String[] input) {
		HashMap<String, Integer> map= new HashMap<String, Integer> ();
		int count=0;
		for(int index=0;index<input.length;index++) {
			String str = input[index];
			if (map.containsKey(str)) {
				count = map.get(str);
					map.put(str, count+1);
			}else 
				map.put(str, 1);
		}
		//System.out.println(map);
		return map;
	}
	public static void main(String[] a) {
		Assingment_47_2 assingment_47_2= new Assingment_47_2();
		String str= "hi good morning hello good morning";
		String[] input= str.split(" ");
		System.out.println("Frequency of each word in given String:");
		System.out.println(assingment_47_2.getFreqOfEachWaord(input));
	}
}
/*Program 2: find frequency of each word from line
i/p : "hi good morning hello good morning"
o/p : hi = 1
	  good = 2
	  morning = 2
	  hello = 1*/
