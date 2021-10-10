/* Assignment - 48 : 9th Oct'2021
program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map */

package akanksha_Jain.Assignment_48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program_3 {
	
	void getNumbersWithFreq1(int[] input) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int number : input) {
			if(map.containsKey(number)) {
				int count = map.get(number);
				map.put(number, count+1);
			}
			else
				map.put(number, 1);
		}
		System.out.print("The numbers having frequency 1 in " + Arrays.toString(input) + " array are ");
		for(int nonDuplicate : map.keySet()) {
			if(map.get(nonDuplicate)==1)
				System.out.print(nonDuplicate + " ");
		}
	}

	public static void main(String[] args) {
		int[] input = {1,11,33,22,22,11,1,9,7,7};
		new Program_3().getNumbersWithFreq1(input);
	}
}