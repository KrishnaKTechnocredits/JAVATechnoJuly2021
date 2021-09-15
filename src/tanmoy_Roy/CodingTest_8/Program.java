/*
 * Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 
 */
package tanmoy_Roy.CodingTest_8;

import java.util.Arrays;

public class Program {
	
	void countPairs(int[] input) {
		int duplicatePairs,i,j,countOfPairs=input.length/2,a,b;
		for(i=0;i<input.length-1;i+=2) {
			duplicatePairs=0;
			a=input[i];
			b=input[i+1];
			for(j=i+2;j<input.length-1;j+=2) {
				if((a==input[j] && b==input[j+1]) || (b==input[j] && a==input[j+1]))
					duplicatePairs++;
			}
			countOfPairs-=duplicatePairs;
		}
		System.out.println("The Count of Pairs in array :" + Arrays.toString(input)+ " is : "+ countOfPairs);
	}

	public static void main(String[] args) {
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8,6,3,8,8,1,2};
		Program prg = new Program();
		prg.countPairs(input);
	}

}
