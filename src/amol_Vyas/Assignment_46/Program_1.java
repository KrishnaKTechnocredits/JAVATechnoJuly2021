/*Write a program to find given number is present in the arrayList or not.*/

package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_1 {

	static void findNumberIsPresentOrNot(ArrayList<Integer> input,int number) {
			if(input.contains(number))
				System.out.println(number+" : is present in the ArrayList");
			else
				System.out.println(number+" : is not present in the ArrayList");
	}
	
	public static void main(String[] args) {
		Integer[] input = { 1, 6, 2, 9, 3, 0, 2, 4 };
		ArrayList<Integer> arraylist = new ArrayList<Integer>(Arrays.asList(input));
		findNumberIsPresentOrNot(arraylist, 5);
		findNumberIsPresentOrNot(arraylist, 9);
	}
}
