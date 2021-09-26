/*  
 Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 
 */
package sushant;

import java.util.Arrays;

public class CodingTest_7 {

	void countIncreasingTriplets(int[] input) {
		int i,count=0,a,b,c;
		for(i=0;i<input.length-2;i++) {
			a=input[i];
			b=input[i+1];
			c=input[i+2];
			if(a<b && b<c)
				count++;
		}
		System.out.println("Count of Triplets with increasing numbers: "+ count);

	}

	public static void main(String[] args) {
		CodingTest_7 codingTest_7 = new CodingTest_7();
		int[] input= {10,9,11,6,23,25,22,66,34,37,39,40};
		System.out.println("The Array : "+Arrays.toString(input));
		codingTest_7.countIncreasingTriplets(input);

	}

}