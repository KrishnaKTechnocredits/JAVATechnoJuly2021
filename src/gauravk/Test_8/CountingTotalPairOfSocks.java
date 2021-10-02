package gauravk.Test_8;
/*
 * Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 
 */

import java.util.Arrays;

public class CountingTotalPairOfSocks {
	
	public CountingTotalPairOfSocks(int[] socksPool) {
		System.out.println("Finding total pairs of socks from."+Arrays.toString(socksPool));
		int totalPairs = 0;
		for(int i=0; i<socksPool.length; i++) {
			int x = socksPool[i];
			int count=1;
			for(int j=i+1; j<socksPool.length; j++) {
				if(socksPool[i]==socksPool[j] && socksPool[i]!=0) {
				count++;
				socksPool[j]=0;
				}
			}
			count = count/2;
			totalPairs +=count;
		}
		System.out.println("There are total "+totalPairs+" pairs possible.");
	}
	
	public static void main(String[] args) {
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		new CountingTotalPairOfSocks(input);
	}
}