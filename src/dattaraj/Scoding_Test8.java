package dattaraj;

import java.util.Arrays;

public class Scoding_Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scoding_Test8 test8 = new Scoding_Test8();
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		System.out.println("The total count of pairs in the array " + Arrays.toString(input) + " are " + test8.findPairOfSocks(input));
		
	}

	int findPairOfSocks(int[] input) {
		
		// TODO Auto-generated method stub
		int pair = 0, total = 0;
		for(int index=0; index<input.length-1; index++) {
			int count = 1;
			for(int innerIndex=index+1; innerIndex<input.length; innerIndex++) {
				if(input[index]==input[innerIndex] && input[innerIndex] != 0) {
					count ++;
					input[innerIndex]=0;
				}
			}
			pair= count/2;
			total = total + pair;
		}
		return total;
	}

}
