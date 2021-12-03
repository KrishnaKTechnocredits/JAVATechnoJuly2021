package gauravk.Assignment_48;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Assignment - 48 : 9th Oct'2021

Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map

if(hm.containsKey(key))
	hm.put(key, hm.get(key)+1);
else
	hm.put(key,1);
 */
public class ReturnPairOfSocks {
	
	
	void pairingSocks(Integer[] socks) {
		int pairs=0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(Integer i: socks) {
			if(hm.containsKey(i))
				hm.put(i, hm.get(i)+1);
			else hm.put(i, 1);
		}
		for(Integer num: hm.keySet()) {
			pairs += hm.get(num)/2;
		}
		System.out.println("Socks sizes: "+hm);
		System.out.println("Total number of pair of socks possible are: "+pairs);	
	}
	
	public static void main(String[] args) {
		Integer [] input = {10,3,10,4,7,4,10,3,2,7};
		new ReturnPairOfSocks().pairingSocks(input);
	}
}
