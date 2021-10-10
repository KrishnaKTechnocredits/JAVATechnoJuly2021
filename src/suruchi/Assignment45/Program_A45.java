package suruchi.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_A45 {

	void removeDuplicatesFromArrayList(ArrayList<String> al) {
		ArrayList<String> outputAl = new ArrayList<String>();
		for (String str : al) {
			if (!outputAl.contains(str))
				outputAl.add(str);
		}
		System.out.println("ArrayList with duplicates removed is: " + outputAl);
	}

	void printDuplicatesFromArrayList(ArrayList<String> al) {
		ArrayList<String> outputAl = new ArrayList<String>();
		for (int index = 0; index < al.size(); index++) {
			String str = al.get(index);
			if (index == al.indexOf(str) && al.indexOf(str) != al.lastIndexOf(str))
				outputAl.add(str);
		}
		System.out.println("ArrayList with only duplicates is: " + outputAl);
	}

	void printIndexOfAllOccurencesOfGivenStringFromArrayList(ArrayList<String> al, String element) {
		System.out.println("Indexes of occurences of the element in the arraylist are: ");
		for (int index = 0; index < al.size(); index++) {
			if (al.get(index).contains(element))
				System.out.println(index);
		}
	}

	ArrayList<String> getArrayList(ArrayList<String> al) {
		ArrayList<String> outputAl = new ArrayList<String>();
		for (String name : al) {
			if (name.startsWith("A") && name.length() > 6)
				outputAl.add(name);
		}
		return outputAl;
	}

	public static void main(String[] args) {
		Program_A45 program_A45 = new Program_A45();

		ArrayList<String> al = new ArrayList<String>(Arrays.asList("Techno", "Mayur", "Chandni", "Amruta", "Chandni",
				"Parthav", "Mayur", "Amruta", "Credits", "Amruta"));

		program_A45.removeDuplicatesFromArrayList(al);
		System.out.println();
		program_A45.printDuplicatesFromArrayList(al);

		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("Techno", "Akanksha", "Mayur", "Chandni",
				"Akanksha", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits", "Amruta"));

		System.out.println();
		program_A45.printIndexOfAllOccurencesOfGivenStringFromArrayList(al1, "Akanksha");

		ArrayList<String> al2 = new ArrayList<String>(Arrays.asList("Techno", "Akanksha", "Mayur", "Chandni",
				"Akanksha", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits", "Amruta", "AparnaTiwari"));

		System.out.println();
		System.out.println("Arraylist containing names starting with A and length greater than 6 is: "
				+ program_A45.getArrayList(al2));
	}
}