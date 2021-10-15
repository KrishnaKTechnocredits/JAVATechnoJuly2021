package shreya_assignment_45_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnArrayList {
	ArrayList<String> printNames(ArrayList<String> names) {

		ArrayList<String> outputList = new ArrayList<String>();

		for (int index = 0; index < names.size(); index++) {
			if (names.get(index).startsWith("A") && names.get(index).length() > 6)
				if (index == names.indexOf(names.get(index)))
					outputList.add(names.get(index));
		}
		return outputList;
	}

	public static void main(String[] args) {
		ReturnArrayList returnArrayList=new ReturnArrayList();
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno", "Akanksha", "Mayur", "Chandni",
				"Akanksha", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits", "Amruta", "AparnaTiwari"));
		System.out.println("Input list " + names);
		System.out.println(
				"ArrayList which contains name starts with A and having length more than 6 chars is : " + returnArrayList.printNames(names));// TODO Auto-generated method stub

	}

}
