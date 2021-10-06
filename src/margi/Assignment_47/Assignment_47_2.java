package margi.Assignment_47;

import java.util.HashMap;

/*Program 2: find frequency of each word from line
i/p : "hi good morning hello good morning"
o/p : hi = 1
	  good = 2
	  morning = 2
	  hello = 1*/

public class Assignment_47_2 {

	HashMap<String,Integer> getFreq(String str) {
		String[] arr = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			if(map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, ++count);
			}
			else
				map.put(word, 1);
		}
		return map;
	}

	public static void main(String[] args) {
		Assignment_47_2 assignment_47_2 = new Assignment_47_2();
		String str = "hi good morning hello good morning";
		System.out.println(assignment_47_2.getFreq(str));
	}
}
