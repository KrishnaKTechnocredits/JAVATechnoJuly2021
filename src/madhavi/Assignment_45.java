package madhavi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_45 {
	void removeDuplicatesFromarraylist(ArrayList<String> nameList) {
		for (int index = 0; index < nameList.size(); index++) {
			if (nameList.indexOf(nameList.get(index)) != nameList.lastIndexOf(nameList.get(index))) {
				nameList.remove(nameList.lastIndexOf(nameList.get(index)));
			}
		}
		System.out.println("New String array:-" + "\n" + nameList);
		System.out.println("****************");
	}

	void printDuplicatesFromarraylist(ArrayList<String> nameList) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < nameList.size(); index++) {
			if (nameList.indexOf(nameList.get(index)) != nameList.lastIndexOf(nameList.get(index))) {
				if (index == nameList.indexOf(nameList.get(index))) {
					output.add(nameList.get(index));
				}
			}
		}
		System.out.println("New String array:-" + "\n" + output);
		System.out.println("****************");
	}

	void printIndex(ArrayList<String> nameList, String name) {
		// ArrayList<String> output = new ArrayList<String>();
		while (nameList.contains(name)) {
			System.out.println(nameList.indexOf(name) + " is index of occurance of name Akanksha");
			nameList.remove(name);

		}
		System.out.println("****************");
	}

	ArrayList<String> getArrayList(ArrayList<String> nameList) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < nameList.size(); index++) {
			if (nameList.get(index).startsWith("A") && nameList.get(index).length() > 6)
				if (index == nameList.indexOf(nameList.get(index)))
					output.add(nameList.get(index));
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Techno", "Mayur", "Chandni", "Amruta", "Chandni",
				"Parthav", "Mayur", "Amruta", "Credits", "Amruta"));
		System.out.println("Original String array:-" + "\n" + list1);
		Assignment_45 assignment_45 = new Assignment_45();
		assignment_45.removeDuplicatesFromarraylist(list1);

		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Techno", "Mayur", "Chandni", "Amruta", "Chandni",
				"Parthav", "Mayur", "Amruta", "Credits", "Amruta"));
		System.out.println("Original String array:-" + "\n" + list2);
		assignment_45.printDuplicatesFromarraylist(list2);

		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("Techno", "Akanksha", "Mayur", "Chandni",
				"Akanksha", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits", "Amruta"));
		System.out.println("Original String array:-" + "\n" + list3);
		assignment_45.printIndex(list3, "Akanksha");

		ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("Techno", "Akanksha", "Mayur", "Chandni",
				"Akanksha", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits", "Amruta", "AparnaTiwari"));
		System.out.println("Original String array:-" + "\n" + list4);
		System.out.println("New String array:-");
		System.out.println(assignment_45.getArrayList(list4));

	}

}
