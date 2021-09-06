/*Assignment - 28 : 4th Sep'2021 

Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43

Note : Please watch session recording for hints*/

package chandani.Assignment_28;

import java.util.Arrays;

class Assignment28a{

	void getSecondHighestNumber(int[] input){
		
		int maxnumber = input[0];
		int secondhighestmaxnumber = input[1];
		
		for (int index = 0; index < input.length; index++){
			if(input[index] > maxnumber){
				secondhighestmaxnumber = maxnumber;
				maxnumber = input[index];
			}
		}
		System.out.println("Second highest number in the given array " +Arrays.toString(input) + " is : " + secondhighestmaxnumber);
	}
	
	public static void main(String[] args){
		Assignment28a assignment28a = new Assignment28a();
		int[] arr = {10,23,2,11,55,43,99};
		assignment28a.getSecondHighestNumber(arr);	
	}
}
