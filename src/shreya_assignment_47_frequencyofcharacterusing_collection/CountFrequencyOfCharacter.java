package shreya_assignment_47_frequencyofcharacterusing_collection;

import java.util.HashMap;

public class CountFrequencyOfCharacter {
	void getFrequency(String input) {
		HashMap<Character,Integer> countChar = new HashMap<Character,Integer>();
		char[] arr=input.toCharArray();
		for(char ch:arr) {
			if(countChar.containsKey(ch))
            {
				countChar.put(ch, countChar.get(ch)+1);
            }
           
            // If char is not present set key value to 1
            else
            {
            	countChar.put(ch, 1);
            }
		}
		 System.out.println("Frequency of each charachter in string : "+input);
		 System.out.println(countChar);
	}
	public static void main(String[] args) {
		CountFrequencyOfCharacter countFrequencyOfCharacter = new CountFrequencyOfCharacter();
		countFrequencyOfCharacter.getFrequency("varsha");

	}

}
