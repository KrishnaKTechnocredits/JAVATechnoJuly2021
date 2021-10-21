//program 7 : find the freq of each number in given array.

package astha.Assignment48;

import java.util.HashMap;

public class Program7 {

	void printNumberFrequency(int[] input) {
		HashMap<Integer, Integer> numberFrequencyMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < input.length; index++) {
			if (numberFrequencyMap.containsKey(input[index]))
				numberFrequencyMap.put(input[index], numberFrequencyMap.get(input[index]) + 1);
			else
				numberFrequencyMap.put(input[index], 1);
		}

		System.out.println(numberFrequencyMap);
	}
	
	public static void main(String[] args) {
		Program7 program7 = new Program7();
		int[] input = {2,5,8,8,9,2,5,7,6,1,1,9,8,0,8};
		program7.printNumberFrequency(input);
	}
}
