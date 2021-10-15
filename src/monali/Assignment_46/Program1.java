package monali.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
/*Example 1 : 
Write a program to find given number is present in the arrayList or not.*/

public class Program1 {

	static void getNumberPresentorNot(ArrayList<Integer> list, int num) {
		if (list.contains(num)) {
			System.out.println("Number is present in list -->"+num);
		} else
			System.out.println("Number is not present in arraylist-->"+num);

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 10, 50, 60, 70, 50));
		getNumberPresentorNot(list, 10);
		getNumberPresentorNot(list, 99);

	}
}
