package neha.assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/
public class Program2 {
	void printDuplicates(String[] arr) {
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> output = new ArrayList();
		int i = 0;
		int alSize = nameList.size();
		for (; i < alSize; i++) {
			String name = nameList.get(i);
			if (!(i == nameList.indexOf(name)) && !(output.contains(name))) {
				output.add(nameList.get(i));
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();
		String[] arr = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		program2.printDuplicates(arr);
	}
}
