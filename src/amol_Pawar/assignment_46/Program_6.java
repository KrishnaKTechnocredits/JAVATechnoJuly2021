
/*Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/

package amol_Pawar.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program_6 {

	void getSecondLargestNum(Integer arr[]) {
		Set<Integer> num = new TreeSet(Arrays.asList(arr));
		ArrayList<Integer> list = new ArrayList<>(num);
		System.out.println(
				"Second highest num in given list " + Arrays.toString(arr) + " is : " + list.get(list.size() - 2));
	}

	public static void main(String[] args) {
		Program_6 program_6 = new Program_6();
		Integer[] arr = { 2, 3, 4, 2, 4, 7, 9, 5 };
		program_6.getSecondLargestNum(arr);

	}

}
