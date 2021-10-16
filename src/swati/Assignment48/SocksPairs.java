package swati.Assignment48;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map
 */
public class SocksPairs {
	
	void findTotalPairs(Integer[] input) {
		LinkedHashMap<Integer,Integer> map1=new LinkedHashMap<Integer,Integer>();
		for(int temp:input) {
			if(map1.containsKey(temp)) {
				map1.put(temp,map1.get(temp)+1);
			}else
				map1.put(temp,1);	
		}
		
		System.out.println(map1);
		Set<Integer> set1=map1.keySet();
		int count=0;
		for(int num:set1) {
			count=count+map1.get(num)/2;	
		}
		System.out.println("Total Pairs: "+count);
	}
	public static void main(String[] a) {
		SocksPairs s1=new SocksPairs();
		Integer[] input= {10,3,10,4,7,4,10,3,2,7};
		s1.findTotalPairs(input);
		
		
	}
}

