package shantanu.maxNumberUsingArrayList_assignment44;

import java.util.ArrayList;

public class FindMaxNumber {
	int findMax(ArrayList<Integer> listOfNumbers) {
		int max = 0;
		for(int num : listOfNumbers) {
			if(num > max)
				max = num;
		}
		return max;
	}
	public static void main(String[] args) {
		FindMaxNumber findMaxNumber = new FindMaxNumber();
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(10);
		listOfNumbers.add(7);
		listOfNumbers.add(99);
		listOfNumbers.add(53);
		listOfNumbers.add(74);
		
		System.out.println("Max number is: "+findMaxNumber.findMax(listOfNumbers));
	}
}
