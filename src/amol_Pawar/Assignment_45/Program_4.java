package amol_Pawar.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_4 {

	void getString(List input) {

		ArrayList outputList = new ArrayList<>();
		for (int index = 0; index < input.size(); index++) {
			String str = (String) input.get(index);
			if (str.startsWith("A") && str.length() > 6) {
				if (input.indexOf(str) == index)
					outputList.add(str);
			}
		}
		System.out.print("ArrayList which contains name starts with A and having length more than 6 is : ");
		System.out.print(outputList);
	}

	public static void main(String[] args) {
		Program_4 program_4 = new Program_4();
		String arr[] = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav", "Mayur",
				"Amruta", "Credits", "Amruta", "AparnaTiwari" };
		List input = Arrays.asList(arr);
		program_4.getString(input);

	}
}
/*
 * program 4 : return an ArrayList which contains name starts with A and having
 * length more than 6 chars. input :
 * ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni",
 * "Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"] output :
 * [Akanksha, AparnaTiwari]
 */
