package neha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Test - 9 : 21st Nov 2021, Expected Time: 15 min
find closest negative number with respect to 8 
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3*/
public class Array_CodingTest9 {
	void findNegativeNumClosestToZero(Integer[] num) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(num));
		Collections.sort(al);
		System.out.println("Sorted arraylist: " + al);
		for (int i = al.size() - 1; i >= 0; i--) {
			if (al.get(i) < 0) {
				System.out.println("Negative Number closest to 0 --> " + al.get(i));
				break;
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { -3, 11, 123, -11, -9, -55, 33, 44 };
		new Array_CodingTest9().findNegativeNumClosestToZero(arr);
	}
}
