package neha.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/
public class Program11 {
	void removeAllZerosFromGivenArrayList(ArrayList<Integer> al) {
		Integer zero = new Integer(0);
		while (al.contains(zero)) {
			al.remove(zero);
		}
		System.out.println(al);
	}

	public static void main(String[] args) {
		Program11 program11 = new Program11();
		Integer[] num = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(num));
		program11.removeAllZerosFromGivenArrayList(list);
	}
}
