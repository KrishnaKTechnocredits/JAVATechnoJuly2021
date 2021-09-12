package shreya_codingtest_4;

import java.util.Arrays;

public class ShiftZerosAtEnd {
	 int[] pushZerosToEnd(int[] arr) {
		 int[] output=new int[arr.length];
		 int count=0;
		 for(int index=0;index<arr.length;index++) {
			 if(arr[index]!=0) {
				 output[count++]=arr[index];
			 }
		 }
		 
		 while(count<arr.length) 
			 output[count++]=0;
			return output;
		 
		
	 }
	public static void main(String[] args) {
		ShiftZerosAtEnd shiftZerosAtEnd=new ShiftZerosAtEnd();
		int[] arr={1,0,0,6,0,2,3,0,4,0,5};		
		int[] output=(shiftZerosAtEnd.pushZerosToEnd(arr));
		System.out.println(Arrays.toString(output));
		
	}
}


