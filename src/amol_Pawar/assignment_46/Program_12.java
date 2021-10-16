/*Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [12,18,22]*/

package amol_Pawar.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_12 {

	boolean getNonPrimeNum(int num) {
		boolean flag = true;
		for (int index = 2; index < num / 2; index++) {
			if (num % 2 == 0) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		return flag;
	}

	void getListOfNonPrimeNumbers(List<Integer> input) {
		ArrayList<Integer> list = new ArrayList();
		for (Integer inputNum : input) {
			if (!getNonPrimeNum(inputNum)) {
				list.add(inputNum);
			}
		}
		System.out.println("Non preime numbers are :" + list);
	}

	public static void main(String[] args) {
		Program_12 program_12 = new Program_12();
		Integer arr[] = { 19, 12, 18, 17, 23, 22 };
		List<Integer> inputList = new ArrayList(Arrays.asList(arr));
		program_12.getListOfNonPrimeNumbers(inputList);

	}

}
