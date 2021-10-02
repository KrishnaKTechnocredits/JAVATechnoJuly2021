/*
 * Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]

Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]

program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4

program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]
 */
package umakant.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45 {

	ArrayList<String> removeMultipleOccurance(String[] inputArray) {
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(inputArray));
		ArrayList<String> outputList = new ArrayList<String>();
		for (String element : inputList) {
			if (!outputList.contains(element))
				outputList.add(element);
		}
		return outputList;
	}

	// not in Assignment, just added it for practice
	ArrayList<String> getUniqueElements(String[] inputArray) {
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(inputArray));
		ArrayList<String> outputList = new ArrayList<String>();
		for (int index = 0; index < inputList.size(); index++) {
			String element = inputList.get(index);
			if ((index == inputList.indexOf(element)) && (inputList.indexOf(element) == inputList.lastIndexOf(element)))
				outputList.add(element);
		}
		return outputList;
	}

	ArrayList<String> getDuplicateElements(String[] inputArray) {
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(inputArray));
		ArrayList<String> outputList = new ArrayList<String>();
		for (int index = 0; index < inputList.size(); index++) {
			String element = inputList.get(index);
			if ((index == inputList.indexOf(element)) && (inputList.indexOf(element) != inputList.lastIndexOf(element)))
				outputList.add(element);
		}
		return outputList;
	}

	void printIndexOfOccurence(String[] inputArray, String element) {
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(inputArray));
		int noOfOccurance = 0;
		while (inputList.contains(element)) {
			System.out.print(inputList.indexOf(element) + noOfOccurance + " ");
			inputList.remove(element);
			noOfOccurance++;
		}
		System.out.println();
	}

	ArrayList<String> getFilteredElements(String[] inputArray, int minLength, String startinWith) {
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(inputArray));
		ArrayList<String> outputList = new ArrayList<String>();
		for (String element : inputList) {
			if (!outputList.contains(element) && element.length() > minLength && element.startsWith(startinWith))
				outputList.add(element);
		}
		return outputList;
	}

	public static void main(String[] args) {
		String[] inputArray1 = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta",
				"Credits", "Amruta" };
		String[] inputArray2 = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav",
				"Mayur", "Amruta", "Credits", "Amruta" };
		String[] inputArray3 = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav",
				"Mayur", "Amruta", "Credits", "Amruta", "AparnaTiwari" };
		Assignment45 assignment = new Assignment45();
		System.out.println(assignment.removeMultipleOccurance(inputArray1));
		System.out.println(assignment.getUniqueElements(inputArray1));
		System.out.println(assignment.getDuplicateElements(inputArray1));
		assignment.printIndexOfOccurence(inputArray2, "Akanksha");
		System.out.println(assignment.getFilteredElements(inputArray3, 6, "A"));
	}

}
