package rushikesh.assign33;

import java.util.Arrays;

/*
 Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]
 
 */
public class Assign33_2 {
	void putNegativeFirst(int [] input) {
		int[] output=new int[input.length];
		int count=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]<0) {
			output[count]=input[index];
			count++;
			}
		}
		int cnt=count;
		for(int index=0;index<input.length;index++) {
			if(input[index]>0) {
				output[cnt]=input[index];
				cnt++;
				}
		}
		
		System.out.println(Arrays.toString(output));
	
}
	
	public static void main(String[] args) {
		Assign33_2 assign33_2=new Assign33_2();
		int[] input = {1,-3,-2,11,44,55,-76,33,12};
		assign33_2.putNegativeFirst(input);
	}	
	
}
