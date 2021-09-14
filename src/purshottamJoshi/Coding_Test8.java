//Test - 8 : 11th Sep'2021
//How many pairs can be created from below sock size array. [30]
//input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
//output : 2 + 1 + 1 + 1  = 5 
//
package purshottamJoshi;

import java.util.*;
class Coding_Test8{
	
	void getPair(int[] input) {
		System.out.println("Given array : " + Arrays.toString(input));
		int output = 0, pairCount = 0;
		for (int index = 0; index < input.length - 1; index++) {
			int count = 1;
			for (int innerindex = index + 1; innerindex < input.length; innerindex++) {
				if (input[index] == input[innerindex] && input[innerindex] != 0) {
					count++;
					input[innerindex] = 0;
				}
			}
			output = count/2;
			pairCount += output;
		}
		System.out.println("Pairs can be created from sock size array : " + pairCount);
	}

	public static void main(String[] args) {
		Coding_Test8 coding_test8 = new Coding_Test8();
		int[] input = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };
		coding_test8.getPair(input);
	}
}