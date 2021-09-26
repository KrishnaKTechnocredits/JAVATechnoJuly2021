package rasika_test4;

import java.util.Arrays;

/*Shift zeros to end
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};*/
public class Program1 {

	void putAllZerosToEnd(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		for(int index = 0; index<input.length; index++) {
			if(input[index] > 0) {
				output[count] = input[index];
				count++;
			}
		}
		System.out.println(Arrays.toString(output));;
	}
	public static void main(String[] args) {
		Program1 pgm = new Program1();
		int[] array = {1,0,0,6,0,2,3,0,4,0,5};
		pgm.putAllZerosToEnd(array);
	}
}
