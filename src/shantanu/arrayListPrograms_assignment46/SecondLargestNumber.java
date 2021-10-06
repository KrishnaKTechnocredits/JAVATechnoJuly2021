package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;
import java.util.TreeSet;

/*Find the second largest number from Given Array.*/
public class SecondLargestNumber {
	int getSecondLargestNumber(int[] numbers) {
		TreeSet<Integer> setOfNumbers = new TreeSet<Integer>();
		for(int index = 0; index < numbers.length; index++)
			setOfNumbers.add(numbers[index]);
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>(setOfNumbers);
		return listOfNumbers.get(listOfNumbers.size()-2);
	}
	public static void main(String[] args) {
		int[] numbers = {30,20,40,10,50};
		SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
		System.out.print("Second largest number is: ");
		System.out.println(secondLargestNumber.getSecondLargestNumber(numbers));
	}
}
