package avinash.assignment44;

import java.util.ArrayList;
import java.util.Arrays;

/*
Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
*/
public class Assignment44 {
	
	static int getMaxNumberFromArrayList(ArrayList<Integer> input) {
		int max=0;
		for(int index=0;index<input.size();index++) {
			if(input.get(index)>max)
				max = input.get(index);
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {10,7,99,53,74};
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(arr));
		int output = Assignment44.getMaxNumberFromArrayList(input);
		System.out.println("MaxNumberFromArrayList:"+output);
		
	}

}
