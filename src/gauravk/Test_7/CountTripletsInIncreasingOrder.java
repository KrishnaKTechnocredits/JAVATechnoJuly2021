package gauravk.Test_7;

import java.util.Arrays;

/*
 * Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 							[Total time taken = 11 minutes]
 */
public class CountTripletsInIncreasingOrder {
	
	{
		System.out.println("Counting the number of triplets in array.");
	}
	
	public CountTripletsInIncreasingOrder(int[] input) {
		// TODO Auto-generated constructor stub
		int count=0;
		int indexIdentifier = -1;
		for(int i=0; i<input.length-2; i++) {
			if(input[i+1]>input[i] && input[i+2]>input[i+1]) {
				count++;
				indexIdentifier = i;
			}
		}
		System.out.println("Total number of increasing order triplets in array "+Arrays.toString(input)+" is "+count);
		if(indexIdentifier!=-1)
			System.out.println(input[indexIdentifier]+" , "+input[indexIdentifier+1]+" , "+input[indexIdentifier+2]);
	}
	
	public static void main(String[] args) {
		int[] input = {10,9,11,6,23,25,22,66,34};
		new CountTripletsInIncreasingOrder(input);
	}
}
