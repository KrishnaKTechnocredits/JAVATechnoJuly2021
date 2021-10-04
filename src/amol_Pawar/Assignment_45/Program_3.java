package amol_Pawar.Assignment_45;

import java.util.Arrays;
import java.util.List;

public class Program_3 {

	
	void getAllAccuranceOfWord(List input,String compareString) {
		System.out.print(compareString +" is available at index :" );
		for (int index = 0; index < input.size(); index++) {
			if (input.get(index).equals(compareString)) {
				System.out.print(" "+index);
			}
		}
	}

	public static void main(String[] args) {
		Program_3 program_3 = new Program_3();
		String arr[] = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav", "Mayur",
				"Amruta", "Credits", "Amruta" };
		List input = Arrays.asList(arr);
		program_3.getAllAccuranceOfWord(input,"Akanksha");

	}

}
/*
 * program 3: print index of all occurances of Akanksha. input :
 * ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni",
 * "Parthav", "Mayur","Amruta","Credits","Amruta"] output : 1 4
 */
