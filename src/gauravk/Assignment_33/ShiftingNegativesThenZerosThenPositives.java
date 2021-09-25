package gauravk.Assignment_33;

import java.util.Arrays;

/*
 * Assignment - 33 : 11th Sep'2021

*Program 1 : shift all non zeros at the end.*
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]

*Program 2: place all negative numbers at the beginning and all positive numbers at the end.*
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]

*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.*
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]

*program 4 : find the triple which in sequence and having maximum sum*

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12

 */
public class ShiftingNegativesThenZerosThenPositives {
	
	public ShiftingNegativesThenZerosThenPositives(int[] arr) {
		// TODO Auto-generated constructor stub
		int[] output = new int[arr.length];
		
		int j=0, k=0, l=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0)
				j++;
			if(arr[i]==0)
				k++;
		}
		
		for(int i=0,a=0,b=j,c=j+k; i<arr.length; i++) {
			if(arr[i]<0) {
				output[a]=arr[i];
				a++;
			}
			else if(arr[i]==0) {
				output[b]=arr[i];
				b++;
			}
			else {
				output[c]=arr[i];
				c++;
			}
		}
		System.out.println("Shifting Non-zeros to last for array "+Arrays.toString(arr)+"\nOutput: "+Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		int[] input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		new ShiftingNegativesThenZerosThenPositives(input);
	}
}