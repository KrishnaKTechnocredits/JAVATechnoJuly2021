package monali.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPrograms2 {

	/*
	 * Program 1: remove duplicates from arraylist, it should have only single
	 * occurance input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav",
	 * "Mayur","Amruta","Credits","Amruta"] output :
	 * ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]
	 */

	// Remove duplicates and single occurance
	void getSingleOccurance(ArrayList<String> al) {
		ArrayList<String> al2 = new ArrayList<String>();

		for (String name : al) {
			if (!al2.contains(name)) {
				al2.add(name);
			}
		}
		System.out.println(al2);
	}

	/*
	 * Program 2: print duplicates in arraylist [print all the elements having freq
	 * more than 1] input :
	 * ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav",
	 * "Mayur","Amruta","Credits","Amruta"] output : ["Mayur","Chandni","Amruta"]
	 */

	ArrayList<String> printDuplicates(String[] arr) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> output = new ArrayList<String>();

		for (int index = 0; index < al.size(); index++) {
			String name = al.get(index);
			if (index == al.indexOf(name) && al.indexOf(name) != al.lastIndexOf(name)) {
				output.add(name);
			}
		}
		return output;
	}

	/*
	 * program 3: print index of all occurances of Akanksha. input :
	 * ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni",
	 * "Parthav", "Mayur","Amruta","Credits","Amruta"] output : 1 4
	 */

	void printIndexOfAllOccurances(String[] arr, String element) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		for (int index = 0; index < al.size(); index++) {
			if (al.get(index) == element)
				System.out.print("Index: " + index + "\t");
		}
		System.out.println();
	}

	/*
	 * program 4 : return an ArrayList which contains name starts with A and having
	 * length more than 6 chars. input :
	 * ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni",
	 * "Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"] output :
	 * [Akanksha, AparnaTiwari]
	 */

	ArrayList<String> getNameStartsWithAandLengthGreater6(String[] arr) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> output = new ArrayList<String>();

		for (int index = 0; index < al.size(); index++) {
			String name = al.get(index);
			if (name.startsWith("A") && name.length() > 6) {
				if (!output.contains(name)) {
					output.add(name);
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Chandni");
		al.add("Amruta");
		al.add("Monali");
		al.add("Aniket");
		al.add("Mayur");
		al.add("Amruta");
		al.add("Sheela");
		al.add("Amruta");

		String[] input = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		String[] input2 = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav",
				"Mayur", "Amruta", "Credits", "Amruta", "AparnaTiwari" };
		String element = "Akanksha";
		ArrayListPrograms2 arrayList = new ArrayListPrograms2();
		arrayList.getSingleOccurance(al);
		System.out.println(arrayList.printDuplicates(input));
		arrayList.printIndexOfAllOccurances(input2, element);
		System.out.println(arrayList.getNameStartsWithAandLengthGreater6(input2));
	}
}
