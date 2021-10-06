package arti_G_Assignment44;

import java.util.ArrayList;
import java.util.Arrays;

/*
Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
*/
public class FinfOutMaxNum {

	  int getMaxNum(ArrayList<Integer> input) {
		int max=0;
		for(int index=0;index<input.size();index++) {
			if(input.get(index)>max) {
				max=input.get(index);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		FinfOutMaxNum num = new FinfOutMaxNum();
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(10,7,99,53,74));
		System.out.println("Output : "+num.getMaxNum(a1));
	}

}
