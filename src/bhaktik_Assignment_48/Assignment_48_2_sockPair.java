/*Assignment - 48 : 9th Oct'2021

Program 1: Create a system to generate AadharNumber with rules discussed in class.

Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map

if(hm.containsKey(key))
	hm.put(key, hm.get(key)+1);
else
	hm.put(key,1);

*/

package bhaktik_Assignment_48;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Assignment_48_2_sockPair {
	//Program 2 : Find how many pairs of socks we can have from given array.
	
	static void findsocksPair(int[] input) {
		HashMap<Integer, Integer> hm= new HashMap();
		for (int n: input) {
			if (hm.containsKey(n)) {
				int value= hm.get(n);
				hm.put(n, ++value);
				
			}else {
				hm.put(n, 1);//  10,1   3,2 
			}
		}
		System.out.println(hm);
		//in abovve code we have get frequency 
		int pair=0;
		Set<Integer> hmKey= hm.keySet();
		 for (int num: hmKey) {
			 int value= hm.get(num);
			 pair+=value/2;
		 } 
		 System.out.println("Total pair:" +pair);
	}
	
	public static void main(String[] args) {
		int[] num= {10,3,10,4,7,4,10,3,2,7};
		findsocksPair(num);
	}

}
