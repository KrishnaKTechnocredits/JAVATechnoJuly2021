package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;

/*Write a program to add element at particular index of ArrayList?*/
public class AddElementAtParticularIndex {
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
		
		listOfNumbers.add(5, 21);
		System.out.println("List after adding new element");
		System.out.println(listOfNumbers);
	}
}
