package chirag.assignment33;

import java.util.Arrays;

/*Assignment - 33 : 11th Sep'2021
Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]*/

public class ShiftNonZeroToEndInArray {
	
	void getZeroAtEnd(int [] input) {
		int []output =new int[input.length];
		int outputIndex=0;
		for(int index =0;index < input.length;index++) {
			if(input[index] > 0) {
				output[outputIndex]= input[index];
				outputIndex++;
			}
		}
		System.out.println(Arrays.toString(output));
		
	}
	
	public static void main(String[] args) {
		ShiftNonZeroToEndInArray shiftNonZeroToEndInArray = new ShiftNonZeroToEndInArray();
		int [] input = {1,0,3,4,0,2,88,0,0,22,34};
		shiftNonZeroToEndInArray.getZeroAtEnd(input);
	}
}