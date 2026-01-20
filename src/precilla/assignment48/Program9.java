package precilla.assignment48;

import java.util.HashMap;
import java.util.LinkedHashMap;

//program 9 : find the first non repeating word from given string.
public class Program9 {

	void nonrepeating(String input) {
		String[] arr=input.split(" ");
		HashMap<String, Integer> hm=new LinkedHashMap<String,Integer>();
		int count=0;
		for(String word:arr) {
			if(!hm.containsKey(word)) {
				hm.put(word, 1);
			}
			else {
				count=hm.get(word)+1;
				hm.put(word, count);
			}
		}
		int frequency=1;
		for(String freq:hm.keySet()) {
			if(frequency==hm.get(freq)) {
				System.out.println("First non repeating word :"+freq);
				break;
			}
		}
	}
	public static void main(String[] args) {
		String input="Hi Hello Hi Techno Credits Hi Credits";
		System.out.println("input : "+input);
		new Program9().nonrepeating(input);
		
	}

}
