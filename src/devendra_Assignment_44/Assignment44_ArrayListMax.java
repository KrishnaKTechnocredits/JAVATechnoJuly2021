package devendra_Assignment_44;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment44_ArrayListMax {
	void findMax(ArrayList<Integer> num) {
		int max = 0;
		for(int index : num) {
			if(index > max)
				max = index;
		}
		System.out.println("The Max Number in Given ArrayList = " +max);
	}

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(10,7,99,53,74));
		num.add(33);
		num.add(95);
		num.add(12);
		Assignment44_ArrayListMax obj = new Assignment44_ArrayListMax();
		obj.findMax(num);
	}
}

/*
Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
*/