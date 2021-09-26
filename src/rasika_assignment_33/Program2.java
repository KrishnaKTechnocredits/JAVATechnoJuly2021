package rasika_assignment_33;

import java.util.Arrays;

/*place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]*/
public class Program2 {

		void getAllNegNumberAtBeg(int[] input){
		int[] output = new int[input.length];
		int count = 0;
		for(int index = 0; index < input.length; index++) {
			if(input[index] < 0) {
				output[count] = input[index];
				count++;
			}
		}
		int cnt = count;
		for(int index = 0; index < input.length; index++) {
			if(input[index] > 0) {
				output[cnt] = input[index];
				cnt++;
			}
		}
		System.out.println("output = "+Arrays.toString(output));
	}
	public static void main(String[] args) {
		Program2 pgm = new Program2();
		int[] input = {1,-3,-2,11,44,55,-76,33,12};
		System.out.println("Input = "+Arrays.toString(input));
		pgm.getAllNegNumberAtBeg(input);
	}
}
