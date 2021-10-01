package neha;

import java.util.ArrayList;
import java.util.Collections;

//Find maximum number from array list, approach 1
public class ArrListApproach1Assignment44 {
	void findAndDisplayMaxNoFromArrayList(int[] arr) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int num : arr) {
			arrList.add(num);
		}
		Collections.sort(arrList);
		System.out.println("Maximum number from arraylist is " + arrList.get(arr.length - 1));
	}

	public static void main(String[] args) {
		ArrListApproach1Assignment44 arrList1 = new ArrListApproach1Assignment44();
		int[] input = { 10, 7, 99, 53, 74 };
		arrList1.findAndDisplayMaxNoFromArrayList(input);

	}
}
