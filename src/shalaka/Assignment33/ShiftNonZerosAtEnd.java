/*Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]

program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]

program 4 : find the triple which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/
package shalaka.Assignment33;

import java.util.Arrays;

public class ShiftNonZerosAtEnd {
	int [] shiftNonZerosAtEnd(int [] input){
		int output[]= new int[input.length];
		int zeroCount=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]==0) {
				output[zeroCount]=input[index];
				zeroCount++;
			}
		}
		int outputIndex=zeroCount;
		for(int index=0;index<input.length;index++) {
			if(input[index]!=0) {
			output[outputIndex]=input[index];
			outputIndex++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input= {1,0,3,4,0,2,88,0,0,22,34};
		ShiftNonZerosAtEnd shiftNonZerosAtEnd = new ShiftNonZerosAtEnd();
		int [] output=shiftNonZerosAtEnd.shiftNonZerosAtEnd(input);
		System.out.println("After shifting all non zeros at the end new array is: "+Arrays.toString(output));
	}

}
