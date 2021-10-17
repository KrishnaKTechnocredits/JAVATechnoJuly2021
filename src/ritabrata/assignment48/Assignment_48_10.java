/*Assignment - 48 : 9th Oct'2021
program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/

package ritabrata.assignment48;

import java.util.ArrayList;

public class Assignment_48_10 {
	ArrayList<Integer> appendZero(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		list.add(arr[1]);
		for (int index = 2; index < arr.length; index++) {
			list.add(arr[index]);
			if ((arr[index] - 1 == arr[index - 1]) && (arr[index] - 2 == arr[index - 2]))
				list.add(0);
		}
		return list;
	}

	public static void main(String[] args) {
		Assignment_48_10 append= new Assignment_48_10();
		int[] input= { 1, 2, 3, 5, 4, 7 };
		System.out.println("Appending 0 after 3 consecutive number output is: "+append.appendZero(input));;
	}
}
