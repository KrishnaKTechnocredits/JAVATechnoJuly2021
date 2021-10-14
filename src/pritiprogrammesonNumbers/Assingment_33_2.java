package pritiprogrammesonNumbers;

import java.util.Arrays;

public class Assingment_33_2 {
	
	int[] placeNegativeNumAtTheEnd(int[] input) {
		int count=0;int outputIndex=0;
		int output[] = new int[input.length];
		for (int index=0;index<input.length;index++) {
			if (input[index]<0) {
				output[outputIndex]=input[index];
				outputIndex++;	
			}
		}
		 
		 for(int index=0;index<input.length;index++) {
			 if (input[index]>0) {
				 output[outputIndex]=input[index];
				 outputIndex++;	 
			 }
		 }
		return output;
	}
		
	public static void main(String[] a) {
		int []input = {1,-3,-2,11,44,55,-76,33,12};
		Assingment_33_2 assingment_33_2 = new Assingment_33_2();
		System.out.println("Output Array with all negative numbers at the beginning and all positive numbers at the end");
		System.out.println(Arrays.toString(assingment_33_2.placeNegativeNumAtTheEnd(input)));
	}

}
/*Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]*/
