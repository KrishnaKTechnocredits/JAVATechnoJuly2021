package santosh_Assignment_34;

/*Assignment - 34 : 11th Sep'2021
program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];
*/
import java.util.Arrays;

public class Assignment34_Program1{

	void placeZeroAfterTriplet(int input[]) {
		int tCount = 0;
		for (int i = 0; i < input.length - 2; i++) {
			int num1 = input[i];
			int num2 = input[i + 1];
			int num3 = input[i + 2];

			if (num2 == num1 + 1 && num3 == num2 + 1) {
				tCount++;
			}
		}

		System.out.println("Triplets are : " + tCount);
        int size = input.length;
		int output[] = new int[(size + tCount)];
		int tempIndex = 2; 
		output[0] = input[0];
		output[1] = input[1];

		for (int index = 2; index < input.length; index++) { 
		output[tempIndex++] = input[index]; 
        if (input[index - 1] == input[index - 2] + 1 && input[index] == input[index - 1] + 1)
		output[tempIndex++] = 0; 
		}
		System.out.println("Array after adding zero if triplet "+ Arrays.toString(output)+ "\n");
	}

    public static void main(String a[]) {
		Assignment34_Program1 assprogram1 = new Assignment34_Program1();
		int input[] = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 }; 
		System.out.println("Array Elements are : " + Arrays.toString(input));
		assprogram1.placeZeroAfterTriplet(input);
	}
}