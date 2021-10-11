package monali.Assignment_48;

import java.util.ArrayList;

/*program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/

public class Program10 {

	void zeroAppendAfterTriplet(Integer[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		list.add(arr[1]);

		for (int index = 2; index < arr.length; index++) {
			list.add(arr[index]);
			if (arr[index] - 1 == arr[index - 1] && arr[index] - 2 == arr[index - 2]) {
				list.add(0);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 5, 4, 7, 8, 9 };
		Program10 p10 = new Program10();
		p10.zeroAppendAfterTriplet(arr);
	}
}
