package shantanu.collectionFramework_assignment48;

import java.util.HashMap;
import java.util.Set;

public class Program4 {
	public static void main(String[] args) {
		String str = "Hi Hello Hi Techno Credits Credits Hi Credits";
		String[] strArray = str.split(" ");
		
		HashMap<String,Integer> hm = new HashMap();
		for(int index = 0; index < strArray.length; index++) {
			if(hm.containsKey(strArray[index]))
				hm.put(strArray[index], hm.get(strArray[index])+1);
			else
				hm.put(strArray[index], 1);
		}
		
		Set<String> setOfKeys = hm.keySet();
		for(String key : setOfKeys) {
			if(hm.get(key) > 1)
				System.out.println(hm.get(key) + ":" + key);
		}
	}
}
