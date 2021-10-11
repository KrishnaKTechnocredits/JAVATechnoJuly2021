/*program 7 : find the freq of each number in given array.*/

package monika.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_7 {

	static void getFreqOfEachNumber(Integer[] input) {
		Map<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		for(Integer num: input) {
			if(map.containsKey(num))
				map.put(num, map.get(num)+1);
			else
				map.put(num, 1);
		}
		System.out.println("Frequency Of Each Number");
		for(Integer key:map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		
	}
	public static void main(String[] args) {
		Integer[] array= {2,1,2,4,5,6,3,2,1,4};
		getFreqOfEachNumber(array);
	}
}
