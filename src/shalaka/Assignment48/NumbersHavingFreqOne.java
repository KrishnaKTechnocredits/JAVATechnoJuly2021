/*
program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map*/
package shalaka.Assignment48;

import java.util.HashMap;

public class NumbersHavingFreqOne {
	void getNumbers(int[] input) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : input) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		System.out.println("All the numbers having freq 1: ");
		for (int uniqueNo : map.keySet()) {
			if (map.get(uniqueNo) == 1)
				System.out.println(uniqueNo + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		NumbersHavingFreqOne numbersHavingFreqOne = new NumbersHavingFreqOne();
		numbersHavingFreqOne.getNumbers(input);
	}

}
