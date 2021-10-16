package pritiprogrammesonNumbers;

import java.util.Arrays;

public class Assingment_33_1 {
		int[] shiftNonZeroAtEndOfArray(int []input) {
			int count=0;
			int output[]= new int[input.length];
			for(int index=0;index<input.length;index++) {
				if (input[index]==0)
					count++;
			}
			int outputIndex=count;
			for (int index=0;index<input.length;index++) {
				if (input[index]!=0) {
				output[outputIndex]= input[index];
					outputIndex++;
				}
			}
			return output;
		}
	
	public static void main(String[] a) {
		Assingment_33_1 assingment_33_1 = new Assingment_33_1();
		int []input =  {1,0,3,4,0,2,88,0,0,22,34};
		System.out.println("Output Array with all non zero's at the end :");
		System.out.println(Arrays.toString(assingment_33_1.shiftNonZeroAtEndOfArray(input)));
	}

}
/*Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]*/
