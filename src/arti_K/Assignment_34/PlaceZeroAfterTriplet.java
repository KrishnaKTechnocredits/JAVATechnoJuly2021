/*	program 1 : place 0 after the triple which in sequence.
input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];
 */

package arti_K.Assignment_34;

import java.util.Arrays;

public class PlaceZeroAfterTriplet {
	
	void findConsecutivetriplet(int[] arr) {
		int count = 0;
		
		
		for(int index = 0; index <= arr.length-2; index++){
			if(arr[index]+1 == arr[index+1] && arr[index+1]+1 == arr[index+2]){
				count++;
				System.out.println("Consecutive Numbers are : "+arr[index]+","+arr[index+1]+","+arr[index+2]);
			}
		}
		System.out.println("\nCount of Consecutive Number is "+count+"\n");
		
		int[] output =  new int[arr.length+count];
		int outputIndex = 0;
		
		for(int index = 0; index < arr.length; index++){
			
			if(arr[index] <= arr.length-3) {
				
				if(arr[index]+1 == arr[index+1] && arr[index+1]+1 == arr[index+2]){
					
					output[outputIndex] = arr[index];
					outputIndex++;
					output[outputIndex] = arr[index + 1];
					outputIndex++;
					output[outputIndex] = arr[index + 2];
					outputIndex++;
					output[outputIndex] = 0;
					outputIndex++;
					
					index = index + 1;
				}
				else {
					output[outputIndex] = arr[index];
					outputIndex++;
				}
			}
			else {
				output[outputIndex]=arr[index];
			}
		}
		System.out.println("Array After Adding 0 after each Triplet : ");

		for(int index = 0; index < output.length; index++) {
			System.out.print(output[index]+" ");
		}
	}
	
	public static void main(String[] args){
		int[] input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		System.out.println("Given Array : 1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}\n");
		new PlaceZeroAfterTriplet().findConsecutivetriplet(input);
	}
}
