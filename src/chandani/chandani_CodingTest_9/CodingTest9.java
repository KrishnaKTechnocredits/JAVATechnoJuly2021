/*Test - 9 : 21st Nov'2021
find closest negative number with respect to 8 
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3

PR #101 -> time : 15 mins

Branch name - Varun_coding_test_9*/
package chandani.chandani_CodingTest_9;

import java.util.Arrays;

public class CodingTest9 {

	int getClosestNegativeNumToZero(int[] arr) {
		int num = arr[0];
		for(int index=0; index<arr.length; index++) {
			if(arr[index]<0) 
				if(num < arr[index]) 
					num = arr[index];
		}
		return num;
	}
	public static void main(String[] args) {
		int[] arr = {-3,11,123,-11,-9,-55,33,44};
		CodingTest9 codingTest9 = new CodingTest9();
		System.out.println("Closest negative number to zero in array " + Arrays.toString(arr) + " is: " + codingTest9.getClosestNegativeNumToZero(arr));
	}
}

