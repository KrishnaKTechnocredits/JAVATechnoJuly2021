/*Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66*/
package mayur.Assignment_31;

import java.util.Arrays;

public class Program_3 {
	
	void getConsecutiveNum(int[] input) {
		int countConsecutiveNum = 0;
		for (int index = 0; index < input.length; index++) {

			if (index < input.length - 2) {
				if (1 == input[index + 1] - input[index] && 2 == input[index + 2] - input[index]) {
					countConsecutiveNum++;
				}

			}
		}
		System.out.println(
				"Total consecutive numbers in array" + Arrays.toString(input) + " are: " + countConsecutiveNum);
	}

	public static void main(String[] args) {
		Program_3 program_3 = new Program_3();
		int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		program_3.getConsecutiveNum(arr);
	}

}
