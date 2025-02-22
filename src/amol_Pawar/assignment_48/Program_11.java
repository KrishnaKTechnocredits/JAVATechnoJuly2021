/*program 11 : find duplicate from array.*/

package amol_Pawar.assignment_48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_11 {

	void findDuplicateElement(Integer arr[]) {
		List<Integer> list = new ArrayList(Arrays.asList(arr));
		List<Integer> outputList = new ArrayList<>();
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			if (list.indexOf(num) != list.lastIndexOf(num)) {
				if (!outputList.contains(num))
					outputList.add(num);

			}
		}
		System.out.println(outputList);
	}

	public static void main(String[] args) {
		Program_11 program_11 = new Program_11();
		Integer arr[] = { 3, 4, 2, 2, 3, 5, 6, 7, 9, 0 };
		program_11.findDuplicateElement(arr);

	}

}
