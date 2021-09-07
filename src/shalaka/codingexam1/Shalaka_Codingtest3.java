/*int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	specific number: 14
	output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}*/

package shalaka.codingexam1;

public class Shalaka_Codingtest3 {
	int count = 0;

	int[] removeSpecNoFromArray(int[] input, int num) {
		int output[] = new int[input.length - 1];
		for (int index = 0; index < input.length; index++) {
			if (input[index] != num) {
				output[count] = input[index];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int speNum = 14;
		Shalaka_Codingtest3 shalaka_Codingtest3 = new Shalaka_Codingtest3();
		int[] output = shalaka_Codingtest3.removeSpecNoFromArray(input, speNum);
		System.out.print("After removing Specific number output array is: ");
		for (int index = 0; index < output.length; index++) {
			System.out.print(" "+output[index]);
		}
	}
}
