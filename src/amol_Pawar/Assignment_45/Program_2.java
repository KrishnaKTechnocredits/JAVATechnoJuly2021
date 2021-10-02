package amol_Pawar.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_2 {

	void getDuplicateArrayList(List input) {
		ArrayList<String> outputList = new ArrayList<>();
		for (int index = 0; index < input.size(); index++) {
			String str = (String) input.get(index);
			if (input.indexOf(str) != input.lastIndexOf(str)) {
				if (input.indexOf(str) == index)
					outputList.add(str);
			}
		}
		System.out.println("OUTPUT : "+outputList);
	}

	public static void main(String[] args) {

		Program_2 program_2 = new Program_2();
		String input[] = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		List<String> str = Arrays.asList(input);
		program_2.getDuplicateArrayList(str);
	}
}
/*
 * Program 2: print duplicates in arraylist [print all the elements having freq
 * more than 1] input :
 * ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav",
 * "Mayur","Amruta","Credits","Amruta"] output : ["Mayur","Chandni","Amruta"]
 */