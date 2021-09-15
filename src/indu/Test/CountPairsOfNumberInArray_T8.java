/*Test - 8 : 11th Sep'2021


How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 */
package indu.Test;

import java.util.Arrays;

//import java.util.Arrays;

public class CountPairsOfNumberInArray_T8 {

	void countOfPairsInArray(int[] input) {
		
		int pair = 0;
		int length = input.length;
		int count = 0;
		for (int index = 0; index < length; index++) {

			int j = index + 1;

			while (j < length) {
				if (input[index] == input[j] && input[j] !=0) {
					count++;
					input[j] = 0;
					break;
				}
				j++;
			}
		}
		System.out.println("The number of pairs in array \n"+Arrays.toString(input)+" is : "+count);
	}

	public static void main(String[] args) {
		CountPairsOfNumberInArray_T8 test8 = new  CountPairsOfNumberInArray_T8();
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		test8.countOfPairsInArray(input);
	}
}
