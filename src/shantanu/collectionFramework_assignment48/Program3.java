package shantanu.collectionFramework_assignment48;

import java.util.HashMap;
import java.util.Set;

public class Program3 {
	public static void main(String[] args) {
		int[] input = {1,11,33,22,22,11,1,9,7,7};
		
		HashMap<Integer,Integer> hm = new HashMap();
		for(int index = 0; index < input.length; index++) {
			if(hm.containsKey(input[index]))
				hm.put(input[index], hm.get(input[index])+1);
			else
				hm.put(input[index], 1);
		}
		
		System.out.println("Numbers with frequency 1:");
		Set<Integer> setOfKeys = hm.keySet();
		for(int key : setOfKeys) {
			if(hm.get(key) == 1)
				System.out.println(key);
		}
	}
}
