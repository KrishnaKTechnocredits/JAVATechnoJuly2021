package rasika_assignment_33;

import java.util.Arrays;

/*shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]
*/
public class Program1 {
	
	void shiftAllZerosToEnd(int[] input){
		int[] output = new int[input.length];
		int cnt = 0;
		for(int index = 0; index < input.length; index++) {
			if(input[index] > 0) {
				output[cnt] = input[index];
				cnt++;
			}
		}
		System.out.println("Output = "+Arrays.toString(output));
	}

	public static void main(String[] args) {
		Program1 pgm = new Program1();
		int[] input = {1,0,3,4,0,2,88,0,0,22,34};
		System.out.println("input = "+Arrays.toString(input));
		pgm.shiftAllZerosToEnd(input);
	}
}
