package rushikesh.assign33;

import java.util.Arrays;

/*
 Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]
 
 */
public class Assign33_1 {
	void shiftZeroEnd(int[] input) {
		int cnt=0;
		int [] output=new int[input.length];
		for(int i=0;i<input.length;i++) {
			if(input[i]==0) {
				cnt++;
			}
		}	
		int count = cnt;
		for(int i=0;i<input.length;i++) {
			if(input[i]!=0) {
			output[count]=input[i];
			count++;
			}
		}
		System.out.println(Arrays.toString(output));
	}
	
	
	public static void main(String[] args) {
		Assign33_1 assign33_1=new Assign33_1();
		int[] input = {1,0,3,4,0,2,88,0,0,22,34};
		assign33_1.shiftZeroEnd(input);
	}
}
