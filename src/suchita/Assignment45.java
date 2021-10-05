package suchita;
// Assignment 45

import java.util.ArrayList;
import java.util.Arrays;

class Assignment45 {

	//Remove duplicates from ArrayList.
	ArrayList<String> removeDuplicate(String[] inputArray) {
		
		System.out.println("\nGiven string :: "+Arrays.toString(inputArray));
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(inputArray));
		ArrayList<String> outputList = new ArrayList<String>();
		for (String element : inputList) {
			
			if (!outputList.contains(element))
				outputList.add(element);
		}
		return outputList;
	}

	
	//Print duplicates in ArrayList 
	ArrayList<String> printDuplicate(String[] inputArray) {
		
		System.out.println("\nGiven string :: "+Arrays.toString(inputArray));
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(inputArray));
		ArrayList<String> outputList = new ArrayList<String>();
		
		for (int index = 0; index < inputList.size(); index++) {
			
			String element = inputList.get(index);
			if ((index == inputList.indexOf(element)) && (inputList.indexOf(element) != inputList.lastIndexOf(element)))
				outputList.add(element);
		}
		return outputList;
	}
	
	//Print index of all occurences of given string .
	void printIndex(String[] inputArray, String element) {
		
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(inputArray));
		int count = 0;
		
		System.out.println("\nGiven string :: "+Arrays.toString(inputArray));
		System.out.println("Required Index :: ");
		while (inputList.contains(element)) {
			
			System.out.print(inputList.indexOf(element) + count + " ");
			inputList.remove(element);
			count++;
		}
		
	}
	

	//Return an ArrayList which contains name starts with A and having length 6 chars.
	ArrayList<String> getName(String[] inputArray, int minLength, String startinWith) {
		
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(inputArray));
		ArrayList<String> outputList = new ArrayList<String>();
		
		System.out.println("\nGiven string :: "+Arrays.toString(inputArray));
		for (String element : inputList) {
			
			if (!outputList.contains(element) && element.length() > minLength && element.startsWith(startinWith))
				outputList.add(element);
		}
		return outputList;
	}

	public static void main(String[] args) {
		String[] input1 = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta",
				"Credits", "Amruta" };
		String[] input2 = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav",
				"Mayur", "Amruta", "Credits", "Amruta" };
		String[] input3 = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav",
				"Mayur", "Amruta", "Credits", "Amruta", "AparnaTiwari" };
		Assignment45 assignment = new Assignment45();
		System.out.println("Duplicates removed ::"+assignment.removeDuplicate(input1));
		System.out.println("Printing Duplicates :: "+assignment.printDuplicate(input1));
		assignment.printIndex(input2, "Akanksha");
		System.out.println("Printing requires array :: "+assignment.getName(input3, 6, "A"));
	}

}