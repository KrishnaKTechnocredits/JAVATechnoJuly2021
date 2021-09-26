package rasika_assignment_33;
/*place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]*/
import java.util.Arrays;

public class Program3 {
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
			if(input[index] == 0) {
				output[cnt] = input[index];
				cnt++;
			}
		}		
		int indexOfPositiveNumber = cnt;
		for(int index = 0; index < input.length; index++) {
			if(input[index] > 0) {
				output[indexOfPositiveNumber] = input[index];
				indexOfPositiveNumber++;
			}
		}
		System.out.println("output = "+Arrays.toString(output));
	}
	public static void main(String[] args) {
		Program3 pgm = new Program3();
		int[] input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		System.out.println("Input = "+Arrays.toString(input));
		pgm.getAllNegNumberAtBeg(input);
	}
}
