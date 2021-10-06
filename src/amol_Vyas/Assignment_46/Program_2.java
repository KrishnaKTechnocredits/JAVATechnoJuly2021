/*Write a program to find given number is duplicate in arrayList.*/

package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_2 {

	static void isNumberDuplicate(ArrayList<Integer> input, int number) {
		if(input.indexOf(number)!=input.lastIndexOf(number))
			System.out.println(number+": is duplicate number");
		else
			System.out.println(number+": is not duplicate number");
		
	}
	
	public static void main(String[] args) {
		Integer[] input = { 1, 6, 2, 9, 3, 0, 2, 4 };
		ArrayList<Integer> arraylist = new ArrayList<Integer>(Arrays.asList(input));
		isNumberDuplicate(arraylist, 2);
		isNumberDuplicate(arraylist, 9);
	}
}
