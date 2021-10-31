package precilla.assignment48;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map.Entry;
import java.util.Set;
//program 3: print all the numbers having freq 1.
public class NumberFrequency {
	
	public static void main(String[] args) {
		int[] arr= {1,11,33,22,22,11,1,9,7,7};
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
			Entry<Integer,Integer> entry = itr.next();
			if(entry.getValue()==1)
				System.out.println(entry.getKey());
		}
}
}
