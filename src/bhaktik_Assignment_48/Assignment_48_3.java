/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9*/

package bhaktik_Assignment_48;

import java.util.HashMap;
import java.util.Set;

public class Assignment_48_3 {
	static void allNumWit1Frequency(Integer[] input) {
		HashMap<Integer, Integer> hm= new HashMap();
		for (int n: input) {
			if (hm.containsKey(n)) {
				int num= hm.get(n);
				hm.put(n, ++num);
			}else {
				hm.put(n, 1);
			}
		}
		System.out.println(hm);
		Set<Integer> hmKey= hm.keySet();
		 for (int keyHm: hmKey) {
			 if (hm.get(keyHm)==1) {
				 System.out.println(keyHm);
			 }
		 } 
	}
	public static void main(String[] args) {
		Integer[] num= {10,3,10,4,7,10,3,2,7};
		allNumWit1Frequency(num);
		
	}
}
