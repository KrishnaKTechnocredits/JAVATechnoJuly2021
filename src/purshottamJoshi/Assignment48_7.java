/*program 7 : find the freq of each number in given array.*/
package purshottamJoshi;

import java.util.LinkedHashMap;

public class Assignment48_7 {

	void getNumberFrequency(int[] input) {
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for(int number: input) {
			if(map.containsKey(number)) {
				map.put(number, map.get(number)+1);
			}else {
				map.put(number, 1);
			}
		}
		System.out.println(map);
		
	}
	public static void main(String[] args) {
		int[] input= {10,4,33,9,33,10,6};
		new Assignment48_7().getNumberFrequency(input);
	}
}
