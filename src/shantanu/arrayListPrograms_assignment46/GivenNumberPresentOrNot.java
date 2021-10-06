package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;

/*Write a program to find given number is present in the arrayList or not.*/
public class GivenNumberPresentOrNot {
	boolean isGivenNumberPresent(ArrayList<Integer> listOfNumbers,int num) {
		if(listOfNumbers.contains(num))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(10);
		listOfNumbers.add(20);
		listOfNumbers.add(30);
		listOfNumbers.add(40);
		listOfNumbers.add(50);
		listOfNumbers.add(60);
		listOfNumbers.add(70);
		listOfNumbers.add(80);
		listOfNumbers.add(90);
		listOfNumbers.add(100);
		
		GivenNumberPresentOrNot givenNumberPresentOrNot = new GivenNumberPresentOrNot();
		int num = 300;
		if(givenNumberPresentOrNot.isGivenNumberPresent(listOfNumbers,num))
			System.out.println(num + " is present in list");
		else
			System.out.println(num + " is not present in list");
	}
}
