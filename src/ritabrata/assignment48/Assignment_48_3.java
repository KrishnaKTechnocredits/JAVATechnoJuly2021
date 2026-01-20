/*Assignment - 48 : 9th Oct'2021
Program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map*/

package ritabrata.assignment48;

import java.util.HashMap;
import java.util.Set;

public class Assignment_48_3 {
	void allNumWit1Freq(Integer[] input) {
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
		for (int n: input) {
			if (hm.containsKey(n)) {
				int num= hm.get(n);
				hm.put(n, ++num);
			}else {
				hm.put(n, 1);
			}
		}
		Set<Integer> hmKey= hm.keySet();
		System.out.print("The output : ");
		 for (int keyHm: hmKey) {
			 if (hm.get(keyHm)==1) {
				 System.out.print(keyHm+" ");
			 }
		 } 
	}

	public static void main(String[] args) {
		Assignment_48_3 freq= new Assignment_48_3();
		Integer[] input= {1,11,33,22,22,11,1,9,7,7};
		freq.allNumWit1Freq(input);

	}

}
