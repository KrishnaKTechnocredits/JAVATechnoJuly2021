package monali.Assignment_46;
/*Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Program11 {
	ArrayList<Integer> RemoveAllZeros(Integer[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			if (itr.next() == 0)
				itr.remove();
		}
		return list;
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };
		Program11 p11 = new Program11();
		System.out.println(p11.RemoveAllZeros(arr));
	}
}
