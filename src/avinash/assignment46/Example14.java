package avinash.assignment46;

import java.util.ArrayList;

/*Example 14:
Write a program to convert Array to List.*/
public class Example14 {

	static ArrayList<Integer> convertArrayToList(int[] input){
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int num: input) {
			output.add(num);
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {19, 12, 18, 17, 23, 22};
		System.out.println(convertArrayToList(input));

	}

}
