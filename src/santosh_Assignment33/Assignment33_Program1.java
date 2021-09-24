/*Assignment - 33 : 11th Sep'2021

Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]
*/
package santosh_Assignment33;
import java.util.Arrays;
public class Assignment33_Program1 {
    int[] shiftNonZeroElement(int[] input) {
		int[] output = new int[input.length];
		int zeroCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0)
				zeroCount++;
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[zeroCount] = input[index];
				zeroCount++;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Assignment33_Program1 assignment33 = new Assignment33_Program1();
		int[] input1 = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		System.out.println("Input : " + Arrays.toString(input1));
		System.out.println("Output : " + Arrays.toString(assignment33.shiftNonZeroElement(input1)));
	}
}