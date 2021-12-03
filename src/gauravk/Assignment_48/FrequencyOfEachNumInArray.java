package gauravk.Assignment_48;
import java.util.Arrays;
import java.util.LinkedHashMap;
/*
 *Assignment - 48 : 9th Oct'2021

Program 1: DONE  <AadharCardGenerator.java> <AadharCardAgency.java> 

program 7 : find the freq of each number in given array.
-----------------------
 */

public class FrequencyOfEachNumInArray {

	LinkedHashMap<Integer, Integer> extractEachNumberWithFrequency(int [] nums) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int n : nums) {
			if (map.containsKey(n))
				map.put(n, map.get(n) + 1);
			else
				map.put(n, 1);
		}
		return map;	
	}

	public static void main(String[] args) {
		int[] input = {1,11,33,22,22,11,1,9,7,7};
		System.out.println("Input: "+Arrays.toString(input)+"\n........Returning each number from array with their frequencies........");
		System.out.println("Output: "+new FrequencyOfEachNumInArray().extractEachNumberWithFrequency(input));
	}	
}