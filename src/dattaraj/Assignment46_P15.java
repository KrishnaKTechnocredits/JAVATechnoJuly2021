package dattaraj;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_P15 {

	void convertArrayToArrayList(Integer[] input) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(list);
	}

	public static void main(String[] args) {
		Assignment46_P15 pgm15 = new Assignment46_P15();
		Integer[] inputArr = { 10, 20, 30, 55, 66, 77, 66, 20, 100, 98 };
		pgm15.convertArrayToArrayList(inputArr);
	}

}
