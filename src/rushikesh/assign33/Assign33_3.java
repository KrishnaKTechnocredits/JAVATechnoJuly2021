package rushikesh.assign33;

import java.util.Arrays;

/*
 program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]
 */
public class Assign33_3 {
	void arrangeNum(int[] input) {
		int []output =new int[input.length];
		int cnt1=0;
		int countZero=0;
		int cnt2=0;
		for(int index=0;index<input.length;index++) { 
			if(input[index]<0){
				output[cnt1]=input[index];
				cnt1++;
			}
			if(input[index]==0) {
				countZero++;
			}
			cnt2=cnt1+countZero;
		}
		int cnt3=cnt2;
		for(int index=0;index<input.length;index++) { 
			if(input[index]>0){
				output[cnt3]=input[index];
				cnt3++;
			}
		}
	System.out.println(Arrays.toString(output));

	}
	
	public static void main(String[] args) {
	Assign33_3 assign33_3=new Assign33_3();
	int[] input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
	assign33_3.arrangeNum(input);
	}
}
