package precilla.assignment48;
//program 5: find the freq of each character in given word.
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Program5 {
	void frequencyChar(String input) {
		char[] arr= input.toCharArray();
		HashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
			for(char data:arr) {
			if(hm.containsKey(data)) 
				hm.put(data, hm.get(data)+1);
			else
				hm.put(data, 1);
		
		}
		System.out.println(hm);
	}
	public static void main(String[] args) {
		String input="technocredits";
		new Program5().frequencyChar(input);
	}

}
