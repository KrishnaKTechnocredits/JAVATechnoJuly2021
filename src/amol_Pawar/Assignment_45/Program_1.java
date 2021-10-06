package amol_Pawar.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_1 {

	void getArrayList(List input) {
		ArrayList lList = new ArrayList<>();
		for (int index = 0; index < input.size(); index++) {
			String str = (String) input.get(index);

			if (input.indexOf(str) == index) {
				lList.add(str);
			}
		}
		System.out.println(lList);
	}

	public static void main(String[] args) {
		Program_1 program_1 = new Program_1();
		String input[] = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		List<String> arrList = Arrays.asList(input);
		program_1.getArrayList(arrList);

	}

}
/*
 * Program 1: remove duplicates from arraylist, it should have only single
 * occurance input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav",
 * "Mayur","Amruta","Credits","Amruta"] output :
 * ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]
 */