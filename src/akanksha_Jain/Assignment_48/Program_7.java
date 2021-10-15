/* Assignment - 48 : 9th Oct'2021
program 7 : find the freq of each number in given array. */

package akanksha_Jain.Assignment_48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program_7 {

	void findFreqOfEachNumber(int[] input) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println("The frequency of each number in given array- " + Arrays.toString(input));
		for(int number : input) {
			if(map.containsKey(number))
				map.put(number, map.get(number)+1);
			else
				map.put(number, 1);
		}
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,33,22,22,11,1,9,7,7};
		new Program_7().findFreqOfEachNumber(input);
	}
}