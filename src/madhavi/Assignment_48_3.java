package madhavi;

import java.util.ArrayList;
import java.util.HashMap;

// print all the numbers having freq 1.
public class Assignment_48_3 {
	void getNumberFrequency(int[] arr) {
		HashMap<Integer, Integer> numarr = new HashMap<Integer, Integer>();
		ArrayList<Integer> opArr = new ArrayList<Integer>();

		for (int index : arr) {

			if (numarr.containsKey(index))
				numarr.put(index, numarr.get(index) + 1);
			else
				numarr.put(index, 1);
		}

		for (Integer key : numarr.keySet()) {
			if (numarr.get(key) == 1) {
				opArr.add(key);
			}
		}
		
		System.out.println("Numbers from Array having frequency 1 - " +opArr);
	}

	public static void main(String[] args) {
		Assignment_48_3 assignmenmt_48_3 = new Assignment_48_3();
		int[] input = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		assignmenmt_48_3.getNumberFrequency(input);
	}

}
