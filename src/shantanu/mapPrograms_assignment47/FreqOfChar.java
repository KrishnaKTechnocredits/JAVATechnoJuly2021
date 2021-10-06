package shantanu.mapPrograms_assignment47;

import java.util.HashMap;

public class FreqOfChar {
	public static void main(String[] args) {
		String str = "google";
		HashMap<Character,Integer> charFrequency = new HashMap<>();
		
		for(int index = 0; index < str.length(); index++) {
			int count = 1;
			if(!charFrequency.containsKey(str.charAt(index)))
				charFrequency.put(str.charAt(index), count);
			else
				charFrequency.put(str.charAt(index), ++count);
		}
		System.out.println(charFrequency);
	}
	
		
}
