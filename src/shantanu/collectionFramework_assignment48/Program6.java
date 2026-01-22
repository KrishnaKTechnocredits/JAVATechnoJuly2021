package shantanu.collectionFramework_assignment48;

import java.util.HashMap;

public class Program6 {
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		String[] strArray = input.split(" ");
		
		HashMap<String,Integer> hm = new HashMap();
		for(int index = 0; index < strArray.length; index++) {
			if(hm.containsKey(strArray[index]))
				hm.put(strArray[index], hm.get(strArray[index])+1);
			else
				hm.put(strArray[index], 1);
		}
		
		System.out.println(hm);
	}
}
