/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map*/
package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment48_3 {
	
	void getUniqueNumbers(int[] input) {
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for(int number: input) {
			if(map.containsKey(number)) {
				map.put(number,map.get(number)+1);
			}else {
				map.put(number,1);
			}
		}
		ArrayList al = new ArrayList();
		for(int key : map.keySet()) {
			if(map.get(key)==1) {
				al.add(key);
			}
		}
		System.out.println(al);
		
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,33,22,22,11,1,9,7,7};
		new Assignment48_3().getUniqueNumbers(input);
	}

}
