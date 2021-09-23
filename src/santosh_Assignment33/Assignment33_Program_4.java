/*program 4 : find the triple which in sequence and having maximum sum
input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12
*/

package santosh_Assignment33;
import java.util.Arrays;
public class Assignment33_Program_4 {
	void getTripletWithMaxSum(int[] input) {
		int sum = 0;
		int maxIndex = 0;
		int tripletSum = 0;
		for (int index = 0; index < input.length-2; index++) {
			if ((input[index] == input[index + 1] - 1) && (input[index + 1] == input[index + 2] - 1)) {
				tripletSum = input[index] + input[index + 1] + input[index + 2];
				if (sum < tripletSum) {
					sum = tripletSum;
					maxIndex = index;
				}
			}
		}
		System.out.println("Output :  This triplets  " + input[maxIndex] + " " + input[maxIndex + 1] + " " + input[maxIndex + 2]
				+ "  have maximum sum is = " + sum);
	}

	public static void main(String[] args) {
		Assignment33_Program_4 assignment33_4 = new Assignment33_Program_4();
		int[] input4 = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		System.out.println("Input : " + Arrays.toString(input4));
		assignment33_4.getTripletWithMaxSum(input4);
	}
}

	