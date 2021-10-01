/*
 Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
 */
package umakant;

import java.util.ArrayList;

public class Assignment44 {

	int getMaxElementInArrayList(ArrayList<Integer> input) {
		int max = input.get(0);
		for (int element : input) {
			if (element > max)
				max = element;
		}
		return max;
	}

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(10);
		input.add(7);
		input.add(99);
		input.add(53);
		input.add(74);
		System.out.println(new Assignment44().getMaxElementInArrayList(input));
	}

}
