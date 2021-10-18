package precilla.assignment48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Map.Entry;
import java.util.Set;

//Find how many pairs of socks we can have from given array.
public class Program2 {
	public static void main(String[] args) {
		int count=0;
		Integer[] arr= {10,3,10,4,7,4,10,3,2,7};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int data:arr) {
			if(hm.containsKey(data))
				hm.put(data, hm.get(data)+1);
			else
				hm.put(data, 1);
		}
		
		Set<Entry<Integer,Integer>> set=hm.entrySet();
		Iterator<Entry<Integer,Integer>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<Integer,Integer> entry=itr.next();
			count+=entry.getValue()/2;
		}
		System.out.println("Input : "+Arrays.toString(arr));
		System.out.println("No of pairs " +count);
		
	}

}
