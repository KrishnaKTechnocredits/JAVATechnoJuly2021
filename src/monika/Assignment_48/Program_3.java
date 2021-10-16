/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map*/
package monika.Assignment_48;

import java.util.HashMap;
import java.util.Map;

public class Program_3 {

	static void getUniqueElement(int[] input) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int num:input) {
			if(map.containsKey(num))
				map.put(num, map.get(num)+1);
			else
				map.put(num, 1);
		}
		System.out.print("Unique Elements: ");
		for(int key : map.keySet()) {
			if(map.get(key)==1)
				System.out.print(key+" ");
		}
		
	}
	public static void main(String[] args) {
		int[] input = {1,11,33,22,22,11,1,9,7,7};
		getUniqueElement(input);
	}
}
