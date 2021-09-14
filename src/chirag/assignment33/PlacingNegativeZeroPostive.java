package chirag.assignment33;

import java.util.Arrays;

/*Assignment - 33 : 11th Sep'2021
program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]
*/
public class PlacingNegativeZeroPostive {
	
	void getNegativeZeroPositive(int [] input) {
		int [] output = new int [input.length];
		int outputIndex=0;
		for(int index = 0;index<input.length;index++) {
			if(input[index]<0) {
				output[outputIndex]=input[index];
				outputIndex++;
			}
			
		}
		for(int index=0;index<input.length;index++) {
			if(input[index] == 0) {
				output[outputIndex]=input[index];
				outputIndex++;
			}
		}
		for(int index=0;index<input.length;index++) {
			if(input[index] > 0) {
				output[outputIndex]=input[index];
				outputIndex++;
			}
		}
		System.out.println(Arrays.toString(output));
	}
	public static void main(String[] args) {
		PlacingNegativeZeroPostive placingNegativeZeroPostive = new PlacingNegativeZeroPostive();
		int [] input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		placingNegativeZeroPostive.getNegativeZeroPositive(input);
	}

}
