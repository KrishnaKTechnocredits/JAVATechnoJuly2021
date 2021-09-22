/* Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}
*/

package akanksha_Jain;

import java.util.Arrays;

public class Coding_Test_3 {

	void removeNumberFromArray(int[] input, int num) {
		int[] output = new int[input.length-1];
		int outputIndex=0;
		for(int index=0; index<input.length; index++) {
			if(input[index] != num)
				output[outputIndex++] = input[index];
		}
		System.out.println("Output:- " + Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int num = 14;
		Coding_Test_3 test = new Coding_Test_3();
		test.removeNumberFromArray(input, num);
	}
}
