/*
 Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 
*/

package husain.CodingTest_8;

import java.util.Arrays;

public class NumberPairs {

	void loopArray(int arr[]) {

		int pairCount = 0;

		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			if (arr[index] != 0) {
				for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
					if (arr[index] == arr[innerIndex]) {
						count++;
						arr[innerIndex] = 0;
					}
				}
			}
			if (count+1 > 1)
				pairCount = pairCount + (count + 1) / 2;

		}
		System.out.println("THe number of pairs in the given array "+Arrays.toString(arr)+" is "+pairCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPairs pair = new NumberPairs();
		int arr[] = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };
		pair.loopArray(arr);

	}

}
