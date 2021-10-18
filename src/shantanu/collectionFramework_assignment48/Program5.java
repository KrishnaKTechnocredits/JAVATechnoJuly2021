package shantanu.collectionFramework_assignment48;

import java.util.HashMap;

public class Program5 {
	public static void main(String[] args) {
		String str = "technocredits";
		
		HashMap<Character,Integer> hm = new HashMap();
		for(int index = 0; index < str.length(); index++) {
			if(hm.containsKey(str.charAt(index)))
				hm.put(str.charAt(index), hm.get(str.charAt(index))+1);
			else
				hm.put(str.charAt(index), 1);
		}
		
		System.out.println(hm);
	}
}
