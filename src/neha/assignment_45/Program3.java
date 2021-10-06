package neha.assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]*/
public class Program3 {
	void printStringOccurrences(String[] arr, String name) {
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(arr));
		for (int i = 0; i < nameList.size(); i++) {
			if (name.equals(nameList.get(i)))
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Program3 program3 = new Program3();
		String[] arr = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav", "Mayur",
				"Amruta", "Credits", "Amruta" };
		String nameToSearch = "Akanksha";
		program3.printStringOccurrences(arr, nameToSearch);
	}
}
