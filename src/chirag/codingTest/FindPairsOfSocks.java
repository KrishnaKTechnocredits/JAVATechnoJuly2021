package chirag.codingTest;

import java.util.Arrays;

/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 */
public class FindPairsOfSocks {
	void getPairsOfSocks(int [] input) {
		
		System.out.println("Given array input : "+Arrays.toString(input));
		int totalPairOfSocks = 0;
		int pairOfSocks = 0;

			for(int index = 0; index < input.length; index++) {
				int count = 1;
				for (int innerindex = index+1; innerindex <input.length-1; innerindex++ ) {
					if(input[index] == input[innerindex] && input[innerindex] != 0 ) 
					{
						count++;
						input[innerindex] = 0;
					}
				}	
			pairOfSocks = count/2;
			totalPairOfSocks = totalPairOfSocks + pairOfSocks;

			}
			System.out.println("Total pairs of socks is : "+totalPairOfSocks);
		}
	
	public static void main(String[] args) {
		FindPairsOfSocks findPairsOfSocks=new FindPairsOfSocks();
		int [] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		findPairsOfSocks.getPairsOfSocks(input);
	}
}