/*Programming Questions - Collections : 4th Oct'2021
Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList
*/
package shraddha.Assignment46;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReturnAllNegative {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(-11);
		list1.add(13);
		list1.add(-11);
		list1.add(14);
		list1.add(-19);
		list1.add(-99);
		list1.add(-11);
		list1.add(-19);
		list1.add(33);
		System.out.println(list1);
		System.out.println(getNegativeList(list1));
	}

	static LinkedList<Integer> getNegativeList(ArrayList<Integer> al) {
		LinkedList<Integer> outputList = new LinkedList<Integer>();
		for (Integer num : al) {
			if (num < 0 && !outputList.contains(num))
				outputList.add(num);
		}
		return outputList;
	}
}
