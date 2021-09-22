/*Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 */
package shalaka.codingexam1;

import java.util.Arrays;

public class Shalaka_CodingTest7 {
	int [] getCountOfTriplet(int arr[]) {
		int count=0;
		int output[]= new int [3];
		for(int index=0;index<arr.length-2;index++) {
			if((arr[index]<arr[index+1])&& (arr[index+1]<arr[index+2])){
				output[0]=arr[index];
				output[1]=arr[index+1];
				output[2]=arr[index+2];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int arr[]= { 10,9,11,6,23,25,22,66,34};
		Shalaka_CodingTest7 shalaka_CodingTest7 = new Shalaka_CodingTest7();
		int[] output=shalaka_CodingTest7.getCountOfTriplet(arr);
		System.out.println("The number of triplets in increasing order: "+Arrays.toString(output));
	}
}
