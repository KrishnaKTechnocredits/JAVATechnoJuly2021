/* Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 */


package astha.CodingTest.Test8;

public class PairOfSocks {

	int getCountOfSocksPair(int[] input) {
		int[] output = new int[input.length];
		for(int index =0; index<input.length;index++) {
			output[index] = input[index];
		}
		int count = 0;
		int pairCount = 0;
		for(int index=0; index<input.length;index++) {
			for(int innerIndex=0; innerIndex < input.length; innerIndex++) {
				if(input[index]==output[innerIndex]) {
					output[innerIndex]=0;
					count++;
				}
			}
			pairCount += count/2;
			count = 0;
		}
		return pairCount;
	}
	
	public static void main(String[] args) {
		PairOfSocks pairOfSocks = new PairOfSocks();
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		int count = pairOfSocks.getCountOfSocksPair(input);
		if(count!=0)
			System.out.println("Total no of socks pair : "+count);
		else
			System.out.println("no pair could be created from the given array");
	}
}
