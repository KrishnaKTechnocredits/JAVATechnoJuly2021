/*Write a program to find given number is present in the arrayList or not.*/
package amol_Pawar.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_1 {

	void checkNum(List<Integer> inputList, int checkNum) {
		if (inputList.contains(checkNum)) {
			System.out.println("Given ArrayList contains number : " + checkNum);
		} else {
			System.out.println("Given ArrayList dont have number" + checkNum);
		}
	}

	public static void main(String[] args) {
		Program_1 program_1 = new Program_1();
		Integer arr[] = { 3, 4, 5, 2, 5, 2, 4, 7 };
		int checkNum = 2;
		List<Integer> numList = Arrays.asList(arr);
		program_1.checkNum(numList, checkNum);

	}

}
