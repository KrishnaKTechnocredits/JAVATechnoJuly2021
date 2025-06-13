package rushikesh.assign46;

import java.util.ArrayList;
import java.util.Arrays;
//
//Example 2 :
//Write a program to find given number is duplicate in arrayList.

public class Assign46_2 {
	static void findNumberIsDuplicateOrNot(ArrayList<Integer> input, int number) {
		if(input.indexOf(number)!=input.lastIndexOf(number)) {
			System.out.println(number+" is duplicate");
		}else
			System.out.println(number+" is not duplicate");
	}

	public static void main(String[] args) {
		
		Integer[] input = { 3, 6, 2, 9, 4, 0, 2, 5 };
		ArrayList<Integer> arraysList = new ArrayList<Integer>(Arrays.asList(input));
		findNumberIsDuplicateOrNot(arraysList,2);
	
	}
	
}
