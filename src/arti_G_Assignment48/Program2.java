package arti_G_Assignment48;

import java.util.HashMap;
import java.util.Map;

/*Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map

if(hm.containsKey(key))
	hm.put(key, hm.get(key)+1);
else
	hm.put(key,1);*/
public class Program2 {

	int getSocksPair(int[] input) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int pairs=0;
		for(int number : input) {
			if(map.containsKey(number))
				map.put(number, map.get(number)+1);
			else
				map.put(number, 1);
		}
		for(int key : map.keySet()) {
			pairs = pairs+map.get(key)/2;
		}
		return pairs;
		
	}
	public static void main(String[] args) {
		Program2 p2 = new Program2();
		int[] input = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		System.out.println(p2.getSocksPair(input));
	}

}
