package aniket;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to remove duplicate from ArrayList (without using set).
public class Assignment_46_3 {

	void removeDuplicate(Integer[] input) {
		ArrayList<Integer> listNumbers = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> output = new ArrayList<Integer>();
		/*for (int index = 0; index < listNumbers.size(); index++) {
			int num = listNumbers.get(index);
			if (listNumbers.indexOf(num) == listNumbers.lastIndexOf(num)) {
				if (index == listNumbers.indexOf(num)) {
					output.add(num);
				}

			}

		}*/
		
		for(int num:listNumbers) {
			if(!output.contains(num)) {
				output.add(num);	
			}
		}		
		System.out.println(output);
		

	}

	public static void main(String[] args) {

		Integer[] input = { 20, 10, 77, 55, 456, 365, 12, 20, 10, 55, 90 };
		Assignment_46_3 assignment_46_3 = new Assignment_46_3();
		assignment_46_3.removeDuplicate(input);

	}
}
	
