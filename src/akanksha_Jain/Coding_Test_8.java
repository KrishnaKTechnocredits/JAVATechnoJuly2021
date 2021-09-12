/* Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 */

package akanksha_Jain;

import java.util.Arrays;

public class Coding_Test_8 {
	
	int findPairOfSocks(int[] input) {
		int pair = 0, total = 0;
		for(int index=0; index<input.length-1; index++) {
			int count = 1;
			for(int innerIndex=index+1; innerIndex<input.length; innerIndex++) {
				if(input[index]==input[innerIndex] && input[innerIndex] != 0) {
					count ++;
					input[innerIndex]=0;
				}
			}
			pair= count/2;
			total = total + pair;
		}
		return total;
	}

	public static void main(String[] args) {
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		Coding_Test_8 codingTest8 = new Coding_Test_8();
		System.out.println("The total count of pairs in the array " + Arrays.toString(input) + " are " + codingTest8.findPairOfSocks(input));
	}
}
