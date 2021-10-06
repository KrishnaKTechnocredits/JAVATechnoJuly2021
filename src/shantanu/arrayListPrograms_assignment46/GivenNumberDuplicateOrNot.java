package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;
/*Write a program to find given number is duplicate in arrayList.*/
public class GivenNumberDuplicateOrNot {
	boolean isNumberDuplicate(ArrayList<Integer> listOfNumbers, int num) {
		if(listOfNumbers.indexOf(num)!=listOfNumbers.lastIndexOf(num))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(1);
		listOfNumbers.add(2);
		listOfNumbers.add(1);
		listOfNumbers.add(2);
		listOfNumbers.add(3);
		
		GivenNumberDuplicateOrNot givenNumberDuplicateOrNot = new GivenNumberDuplicateOrNot();
		int num = 3;
		if(givenNumberDuplicateOrNot.isNumberDuplicate(listOfNumbers,num))
			System.out.println(num + " is duplicate in the list");
		else
			System.out.println(num + " is not duplicate in the list");
		
	}
}
