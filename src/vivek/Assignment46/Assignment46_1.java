/*Write a program to find given number is present in the arrayList or not.*/

package vivek.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment46_1 {

	static void findGivenNumber(ArrayList<Integer> arrlist, int number) {
		if (arrlist.contains(number))
			System.out.println(number + " is present in the Arralist");
		else
			System.out.println(number + " is not present in the Arralist");
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
		ArrayList<Integer> list1 = new ArrayList<Integer>(list);
		Assignment46_1.findGivenNumber(list1, 10);
	}
}
