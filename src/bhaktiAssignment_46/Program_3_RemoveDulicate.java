package bhaktiAssignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_3_RemoveDulicate {
	// Example 3 :Write a program to remove All duplicate from ArrayList (without
	// using set).

	static void removeDuplicate(ArrayList input) {
		ArrayList duplicate = new ArrayList();
		for (int i = 0; i < input.size(); i++) {
			if (input.indexOf(input.get(i)) != input.lastIndexOf(input.get(i)))
				duplicate.add(input.get(i));
		}
		input.removeAll(duplicate);
		System.out.println(input);
	}

	// by using Array
	static void byUsingArrayRemove() {
		// find dupliacates number
		int[] input = { 1, 7, 6, 2, 9, 6, 3, 7, 0, 2, 4 };
		for (int i = 0; i < input.length; i++) {
			if (input[i] != -1) {
				int count = 0;
				for (int j = i + 1; j < input.length; j++) {
					if (input[i] == input[j]) {
						count++;
						input[j] = -1;
					}
				}
				if (count > 0)
					System.out.println(input[i]);
			}
		}
	}
	////Example 3 :Write a program to remove  duplicate  keep single occurance from ArrayList (without using set).
	
	static void removeDuplicateKeepSigle(ArrayList input) {
		ArrayList output= new ArrayList();
		for (Object n: input) {
			if (!output.contains(n))
				output.add(n);
		}
		
		System.out.println(output);
	}
	 
	public static void main(String[] args) {
		Integer[] input = { 1, 7, 6, 2, 9, 6, 3, 7, 0, 2, 4 };
		ArrayList al1 = new ArrayList(Arrays.asList(input));
		String[] str1 = { "Bhakti", "Harshada", "Amol", "Amruta", "Harshada", "Amol" };
		ArrayList al2 = new ArrayList(Arrays.asList(str1));
		removeDuplicate(al1);
		removeDuplicate(al2);
		byUsingArrayRemove();
		
		removeDuplicateKeepSigle(al1);
		removeDuplicateKeepSigle(al2);
	}
}

