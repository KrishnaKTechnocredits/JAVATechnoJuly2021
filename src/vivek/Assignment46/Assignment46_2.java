/*Example 2 :
Write a program to find given number is duplicate in arrayList.*/

package vivek.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment46_2 {

	static void findGivenNumberIsDuplicate(ArrayList<Integer> al, Integer number) {
		if (al.indexOf(number) == al.lastIndexOf(number) && al.indexOf(number) != -1)
			System.out.println(number + " is not a duplicate number");
		else if (al.indexOf(number) == -1) {
			System.out.println(number + " is not present in the Arralist");
		} else {
			System.out.println(number + " is a duplicate number");
		}
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6, 4, 2, 2, 2, 8, 10, 8, 2, 20);
		ArrayList<Integer> al = new ArrayList<Integer>(list);
		Assignment46_2.findGivenNumberIsDuplicate(al, 22);
		Assignment46_2.findGivenNumberIsDuplicate(al, 6);
		Assignment46_2.findGivenNumberIsDuplicate(al, 2);
	}
}
