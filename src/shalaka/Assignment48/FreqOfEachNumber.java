/*program 7 : find the freq of each number in given array.*/

package shalaka.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfEachNumber {
	void getFreqOfEachNumber(int[] arr) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int num : arr) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		System.out.println("The freq of each number in given array:" + map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 10, 20, 22, 55, 22, 10, 30, 30, 32, 55, 10 };
		FreqOfEachNumber freqOfEachNumber = new FreqOfEachNumber();
		freqOfEachNumber.getFreqOfEachNumber(input);
	}
}
