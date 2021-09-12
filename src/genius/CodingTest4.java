package genius;

import java.util.Arrays;

public class CodingTest4 {

	void returnArray(int[] input) {
		int outputIndex=0;
		int outputIndexZero = 0;
		int[] output = new int[input.length];
		for(int index=0;index<input.length;index++) {
			if(input[index]!=0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
			else {
				output[(output.length-1) - outputIndexZero]=input[index];
			    outputIndexZero++;
			}
		}
		
		System.out.println(Arrays.toString(output));
		
		
	}
	public static void main(String[] args) {
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		CodingTest4 codingtest4 = new CodingTest4();
		codingtest4.returnArray(arr);
        
	}

}
