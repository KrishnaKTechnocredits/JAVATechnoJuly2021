package neha.assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

/*Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]*/
public class Program1 {
	void removeDuplicates(String[] arr) {
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(arr));
		int i = 0;
		int alSize = nameList.size();
		for (; i < alSize; i++) {
			if (!(i == nameList.indexOf(nameList.get(i)))) {
				nameList.remove(i);
				i--;
				alSize--;
			}
		}
		System.out.println(nameList);
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();
		String[] arr = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		program1.removeDuplicates(arr);
	}
}
