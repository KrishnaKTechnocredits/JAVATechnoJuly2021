package arti_G_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 2 :
Write a program to find given number is duplicate in arrayList.*/
public class FindDuplicate {

	static void getDuplicateNumber(ArrayList<Integer> input, int number) {
		if(input.indexOf(number) != input.lastIndexOf(number)) {
			System.out.println(number +" : is duplicate number");
		}
		else {
			System.out.println(number + " : is not duplicate number");
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,8,34,4,56,5,34,87,35));
		getDuplicateNumber(input, 8);
		getDuplicateNumber(input, 34);
	
	}

}
