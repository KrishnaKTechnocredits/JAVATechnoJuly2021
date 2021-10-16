/*Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map
*/
package shalaka.Assignment48;

import java.util.HashMap;

public class PairOfSocks {
	void findPairOfSocks(int[] input) {
		HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		int pairCnt = 0;
		for (Integer num : input) {
			if (numMap.containsKey(num)) {
				numMap.put(num, numMap.get(num) + 1);

			} else
				numMap.put(num, 1);
		}
		for (int key : numMap.keySet()) {
			pairCnt += numMap.get(key) / 2;
		}
		System.out.println("Pair of Socks: " + pairCnt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		new PairOfSocks().findPairOfSocks(input);
	}

}
