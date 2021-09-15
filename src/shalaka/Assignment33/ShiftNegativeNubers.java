/*Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]*/
package shalaka.Assignment33;

import java.util.Arrays;

public class ShiftNegativeNubers {
	int[] placementOfNegativeNumbers(int [] input){
	int[] output=new int[input.length];
		int index1=0;
		for(int index=0;index<input.length;index++){
			if(input[index]<0){
			output[index1]=input[index];
			index1++;
			}
		}
		int outputIndex= index1;
		for(int index=0;index<input.length;index++){
			if(input[index]>0){
			output[outputIndex]=input[index];
			outputIndex++;
			}
		}
		return output;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {1,-3,-2,11,44,55,-76,33,12};
		ShiftNegativeNubers shiftNegativeNubers = new ShiftNegativeNubers();
		int [] output=shiftNegativeNubers. placementOfNegativeNumbers(input);
		System.out.println(" After placing all negative numbers at the beginning new array is: "+Arrays.toString(output));
	}

}
