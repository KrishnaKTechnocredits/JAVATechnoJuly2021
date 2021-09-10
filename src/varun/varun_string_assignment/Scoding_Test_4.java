package varun.varun_string_assignment;

import java.util.Arrays;

public class Scoding_Test_4 {
	
	void sortTheStringArray(int []input) {
		int count=0;
		int []output = new int[input.length];
		for(int index=0;index<input.length;index++) {
			if(input[index]!=0) {
				output[count] = input[index];
				count++;
			}
		}
			for (int index = 0; index < output.length; index++) {
				System.out.print(output[index] + ",");

			}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		Scoding_Test_4 scoding_Test_4 = new Scoding_Test_4();
		scoding_Test_4.sortTheStringArray(arr);
}
}