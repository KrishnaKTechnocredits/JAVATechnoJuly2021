/*Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]
Hint : Method Parameter should be ArrayList, return type should be ArrayList.*/

package vivek.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_11 {

	static ArrayList<Integer> findMissingNumber(ArrayList<Integer> al) {
		int cnt = 1;
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		while (cnt <= 10) {
			if (!(al.contains(cnt)))
				al1.add(cnt);
			cnt++;
		}
		return al1;
	}

	public static void main(String[] args) {
		Integer[] input = { 1, 6, 2, 5, 7, 6, 3, 10 };
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(Assignment46_11.findMissingNumber(al));
	}
}
