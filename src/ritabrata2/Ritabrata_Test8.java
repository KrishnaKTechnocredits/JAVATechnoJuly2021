/*
Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 
*/

package ritabrata2;

import java.util.Arrays;

public class Ritabrata_Test8 {
	int getPairCount(int[] input) {
		Arrays.sort(input);
		int count=0;
		for(int index=0; index<input.length-1;index++) {
			if(input[index]==input[index+1]) {
				index++;
				count++;
			}
		}
		System.out.println("The total count of pair of socks is: "+count);
		return count;
	}
	

	public static void main(String[] args) {
		Ritabrata_Test8 test= new Ritabrata_Test8();
		int[] arr= {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		test.getPairCount(arr);


	}

}
