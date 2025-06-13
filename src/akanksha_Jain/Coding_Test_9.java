/* Test - 9 : 21st Nov'2021
find closest negative number with respect to 8 
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3
*/

package akanksha_Jain;

import java.util.Arrays;

public class Coding_Test_9 {
	
	int getClosestNegativeNoToZero(int[] arr) {
		int closestNumber = arr[0];
		for(int index=0; index<arr.length; index++) {
			if(arr[index]<0) 
				if(closestNumber < arr[index]) 
					closestNumber = arr[index];
		}
		return closestNumber;
	}
	public static void main(String[] args) {
		int[] arr = {-3,11,123,-11,-9,-55,33,44};
		Coding_Test_9 codingTest9 = new Coding_Test_9();
		System.out.println("Closest number to zero in array " + Arrays.toString(arr) + " is: " + codingTest9.getClosestNegativeNoToZero(arr));
	}
}