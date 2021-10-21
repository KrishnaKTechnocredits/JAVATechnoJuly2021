/*Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map*/

package astha.Assignment48;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Program2 {

	Integer getNumberOfSocksPair(int[] input) {
		Integer numberOfPair = 0;
		HashMap<Integer,Integer> socksCountMap = new HashMap<Integer,Integer>();
		for(int index=0; index<input.length;index++) {
			if(socksCountMap.containsKey(input[index]))
				socksCountMap.put(input[index],socksCountMap.get(input[index])+1);
			else
				socksCountMap.put(input[index],1);
		}
		
		System.out.println(socksCountMap);
		
		Set<Integer> keySet = socksCountMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			numberOfPair += socksCountMap.get(key)/2;
		}
		return numberOfPair;
	}
	
	public static void main(String[] args) {
		Program2 program2 = new Program2();
		int[] input = {10,3,10,4,7,4,10,3,2,7};
		System.out.println("The number of socks pair = " +program2.getNumberOfSocksPair(input));
	}
}
