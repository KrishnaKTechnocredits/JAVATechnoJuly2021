/*Write a program to remove duplicate from ArrayList (without using set).*/

package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_4 {

	static void isRemoveDuplicate(ArrayList<Integer> input) {
		ArrayList<Integer> output = new ArrayList();
		for(int num : input) {
			if(!output.contains(num))
				output.add(num);
		}
		
		System.out.println(output);
		
	}
	
	public static void main(String[] args) {
		Integer[] input = { 1, 6, 2, 9, 3, 0, 2, 4,1,9 };
		ArrayList<Integer> arraylist = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(arraylist);
		isRemoveDuplicate(arraylist);
		}
}
