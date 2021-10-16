package pritiprogrammesonNumbers;

import java.util.Arrays;

public class Assingment_33_3 {
	int[] placezeroAndPositivNumAtEnd(int []input) {
		int outputIndex=0; int countZero=0;
		int output[] = new int[input.length];
		for(int index=0;index<input.length;index++) {
			if (input[index]<0) {
				output[outputIndex]=input[index];
				outputIndex++;	
			}
			else if (input[index]==0)
				countZero++;
		}	
		outputIndex = outputIndex+countZero;
		for(int index1=0;index1<input.length;index1++) {
			if(input[index1]>0) {
				output[outputIndex]=input[index1];
				outputIndex++;
			}
		}
		return output;
	}
	public static void main(String[] a) {
		int[] input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		Assingment_33_3 assingment_33_3= new Assingment_33_3();
		System.out.println("Output Array with negative numbers at the beginning, zeros and all positive numbers at the end");
		System.out.println(Arrays.toString(assingment_33_3.placezeroAndPositivNumAtEnd(input)));
	}

}
/* program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]
*/
