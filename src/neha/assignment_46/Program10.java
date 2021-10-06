package neha.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

Hint : Method Parameter should be ArrayList, return type should be ArrayList.*/
public class Program10 {
	ArrayList<Integer> findMissingNum(ArrayList<Integer> list1) {
		ArrayList<Integer> list2 = new ArrayList<Integer>(); // list with all numbers in range 1-10
		int i = 1;
		while (i <= 10) {
			list2.add(i);
			i++;
		}
		list2.removeAll(list1); // remove common numbers to get missing numbers
		return list2;
	}

	public static void main(String[] args) {
		Program10 program10 = new Program10();
		Integer[] num = { 1, 6, 2, 5, 7, 6, 3, 10 };
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(num));
		System.out.println(program10.findMissingNum(list1));
	}
}
