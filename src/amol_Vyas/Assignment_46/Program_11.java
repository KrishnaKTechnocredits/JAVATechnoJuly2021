/*Example 11 :
Remove all zeros from given ArrayList.
input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/

package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Program_11 {

	static ArrayList<Integer> removeAllZeros(ArrayList<Integer> arrayList) {
		while (arrayList.contains(0)) {
			arrayList.remove(new Integer(0));
		}
		return arrayList;
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(removeAllZeros(arrayList));
	}
}
