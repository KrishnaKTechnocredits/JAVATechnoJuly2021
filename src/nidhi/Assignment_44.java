package nidhi;

import java.util.ArrayList;

/** 
Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
**/

class Assignment_44{
	
	public static void main(String[] ar){
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(10);
		input.add(7);
		input.add(99);
		input.add(53);
		input.add(74);
		
		int maxnum=0;
		for (int num : input){
			if (num > maxnum)
				maxnum = num;
		}
		System.out.println("The max number in this Arraylist is : " + maxnum);
		
	}
}