package chirag.Assignment47;

import java.util.HashMap;

/*Program 2: find frequency of each word from line
i/p : "hi good morning hello good morning"
o/p : hi = 1
	  good = 2
	  morning = 2
	  hello = 1*/

public class FindFreqOfEachWord {
	
	public static void main(String[] args) {
		String input = "Hi Good Morning Hello Good Morning";
		String [] temp = input.split(" ");
		HashMap<String , Integer> map = new HashMap<>();
		for(int index = 0;index < temp.length;index++) {
			String word = temp[index];
			if(map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, ++count);
			}
			else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
	}
}
