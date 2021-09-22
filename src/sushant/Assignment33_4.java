/*
 Assignment - 33 : 11th Sep'2021

Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]

Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]

program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]

program 4 : find the triple which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12
 */

package sushant;

public class Assignment33_4 {

	//find the triplet which in sequence and having maximum sum
	int getTriplets(int[] input) {
		int num, sum, maxTriplet=0, maxSum=0;
		for(int index=0; index<input.length-2; index++) {
			sum=0;
			num=input[index];
			if((num+1)==input[index+1]) {
				if((num+2)==input[index+2]) {
					sum = num + (num+1) + (num+2);
				}
				if(maxSum<sum) {
					maxSum=sum;
					maxTriplet = index;
				}
			}
		}
		return input[maxTriplet];
	}
	public static void main(String[] args) {
		Assignment33_4 assignment33_4 = new Assignment33_4();
		int[] arr = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		int number1 = assignment33_4.getTriplets(arr);
		int number2 = number1+1;
		int number3 = number1+2;
		System.out.println(number1 + ", "+ number2 + ", " + number3 + " is a triplet having maximum sum");
	}
}