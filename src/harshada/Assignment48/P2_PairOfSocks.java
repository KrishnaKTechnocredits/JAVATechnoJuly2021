/* Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map
 
if(hm.containsKey(key))
        hm.put(key, hm.get(key)+1);
else
      	hm.put(key,1); */

package harshada.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class P2_PairOfSocks {

	void getSockPair(int arr[]) {
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		int count=0;
		int paircount=0;
		for(Integer num: arr) {
			
			if(map.containsKey(num)) {
				count = map.get(num);
				map.put(num, count+1);
			}else
				map.put(num, 1);
		}
		System.out.println("Map Contents : " + map);
		
		for(int num : map.keySet()) {
			paircount=paircount+ map.get(num)/2;
		}
		System.out.println("Total Sock Pair Possible are : "+ paircount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {10,3,10,4,7,4,10,3,2,7};
		P2_PairOfSocks obj=new P2_PairOfSocks();
		obj.getSockPair(input);
		
	}

}
