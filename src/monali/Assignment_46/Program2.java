package monali.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 2 :
Write a program to find given number is duplicate in arrayList.*/

public class Program2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 10, 50, 60, 70, 50));
		findDuplicateNumber(list);
	}

	static void findDuplicateNumber(ArrayList<Integer> list) {
		for (int index = 0; index < list.size(); index++) {
			if (list.indexOf(list.get(index)) != list.lastIndexOf(list.get(index))) {
				if (list.indexOf(list.get(index)) != index) {
					System.out.println("Number is  duplicate  " + list.get(index));
				}
			} /*
				 * else System.out.println("Number is not duplicate in arraylist " +
				 * list.get(index));
				 */
		}
	}
}
