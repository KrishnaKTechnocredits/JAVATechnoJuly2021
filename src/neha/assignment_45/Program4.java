package neha.assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/
public class Program4 {
	void printStringOccurrences(String[] arr) {
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 0; i < nameList.size(); i++) {
			String name = nameList.get(i);
			if (name.startsWith("A") && name.length() > 6 && !(output.contains(name)))
				output.add(name);
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		Program4 program4 = new Program4();
		String[] arr = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav", "Mayur",
				"Amruta", "Credits", "Amruta", "AparnaTiwari" };
		program4.printStringOccurrences(arr);
	}
}
