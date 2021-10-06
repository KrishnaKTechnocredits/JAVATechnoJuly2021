package shantanu.mapPrograms_assignment47;

import java.util.HashMap;

//find frequency of each word from line
public class FreqOfWord {
	public static void main(String[] args) {
		String str = "hi good morning hello good morning";
		String[] strArray = str.split(" ");
		
		HashMap<String,Integer> wordFrequency = new HashMap();
		for(int index = 0; index < strArray.length; index++) {
			int count = 1;
			if(!wordFrequency.containsKey(strArray[index]))
				wordFrequency.put(strArray[index], count);
			else
				wordFrequency.put(strArray[index], ++count);
		}
		System.out.println(wordFrequency);
	}
}