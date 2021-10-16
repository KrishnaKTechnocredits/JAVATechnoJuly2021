package madhavi;

import java.util.HashMap;

//Find how many pairs of socks we can have from given array.
public class Assignmenmt_48_2 {

	void getSocksPair(int[] arr) {
		HashMap<Integer, Integer> socks = new HashMap<Integer, Integer>();

		int pairs = 0;
		for (int index : arr) {

			if (socks.containsKey(index))
				socks.put(index, socks.get(index) + 1);
			else
				socks.put(index, 1);
		}

		for (Integer key : socks.keySet()) {
			if (socks.get(key) >= 2) {
				pairs = pairs + socks.get(key) / 2;
			}
		}

		System.out.println("Total number of socks pairs: " +pairs);
	}

	public static void main(String[] args) {
		Assignmenmt_48_2 assignmenmt_48_2 = new Assignmenmt_48_2();
		int[] input = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		assignmenmt_48_2.getSocksPair(input);
	}
}
