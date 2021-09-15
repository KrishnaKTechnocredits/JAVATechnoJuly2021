/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 */
package chandani.chandani_CodingTest_8;

import java.util.Arrays;

public class CodingTest8 {
	
	int total = 0;
	int uniquepairofsocks = 0;
	int getPairofSocks(int[] input) {
		
		for(int index = 0; index < input.length; index++) {
			int count = 1;
			for (int innerindex = index+1; innerindex <input.length-1; innerindex++ ) {
				if(input[index] == input[innerindex] && input[innerindex] != 0 ) 
				{
					count++;
					input[innerindex] = 0;
				}
				
			}	
		uniquepairofsocks = count/2;
		total = total + uniquepairofsocks;
					
		}
		return total;
	}
		

	public static void main(String[] args) {
		CodingTest8 codingTest8 = new CodingTest8();
		int [] arr = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		System.out.println("Total pairs of socks are in given String " + Arrays.toString(arr) + " is " +codingTest8.getPairofSocks(arr));
	}

}
