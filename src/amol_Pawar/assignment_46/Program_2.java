//Write a program to find given number is duplicate in arrayList.
package amol_Pawar.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_2 {

	void checkDuplicateNum(List<Integer> inputList, int check) {
		if (inputList.indexOf(check) != inputList.lastIndexOf(check)) {
			System.out.println("Given num " + check + " is duplicate number");
		} else {
			System.out.println("Given num " + check + " is not duplicate number");
		}
	}

	public static void main(String[] args) {
		Program_2 program_2 = new Program_2();
		Integer arr[] = { 3, 4, 2, 4, 5, 23, 5, 5 };
		List<Integer> inputList = Arrays.asList(arr);
		int num = 4;
		program_2.checkDuplicateNum(inputList, num);

	}

}
