package shantanu.collectionFramework_assignment48;

import java.util.HashMap;
import java.util.Set;

public class Program2 {
	public static void main(String[] args) {
		int[] input = {10,3,10,4,7,4,10,3,2,7};
		int count = 0;
		
		HashMap<Integer,Integer> socks = new HashMap();
		for(int index = 0; index < input.length; index++) {
			if(socks.containsKey(input[index]))
				socks.put(input[index], socks.get(input[index]) + 1);
			else
				socks.put(input[index],1);
		}
		
		Set<Integer> setOfKeys = socks.keySet();
		for(int key : setOfKeys) {
			count = count + socks.get(key)/2;
		}
		
		System.out.println("Total pairs of socks: "+count);
		
	}
}
