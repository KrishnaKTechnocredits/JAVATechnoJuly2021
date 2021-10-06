package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;

/*Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).*/
public class RemoveElementFromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(1);
		listOfNumbers.add(6);
		listOfNumbers.add(2);
		listOfNumbers.add(5);
		listOfNumbers.add(7);
		listOfNumbers.add(6);
		listOfNumbers.add(3);
		listOfNumbers.add(10);
		
		listOfNumbers.remove(new Integer(3));
		System.out.println("List after removing element");
		System.out.println(listOfNumbers);
	}
}
