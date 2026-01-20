/* Assignment-45 : 2nd Oct
 
Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]
 
Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]
 
program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
     	4
 
program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]                           	
output : [Akanksha, AparnaTiwari]
 
*/
package harshada.Assignment41_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment_45 {

	void p1_RemoveDuplicates(String str[]) {

		List<String> list = new ArrayList<String>(Arrays.asList(str));
		List<String> output = new ArrayList<String>();

		for (String input : list) {
			if (!output.contains(input)) {
				output.add(input);
			}
		}

		System.out.println("Unique ArrayList is : " + output);
	}

	void p2_getDuplicates(String str[]) {

		List<String> inputList = new ArrayList<String>(Arrays.asList(str));
		List<String> outputList = new ArrayList<String>();
		for (int index = 0; index < inputList.size(); index++) {
			String temp = inputList.get(index);
			if (inputList.indexOf(temp) != inputList.lastIndexOf(temp)) {
				if (!outputList.contains(temp)) {
					outputList.add(temp);
				}
			}
		}
		System.out.println("Duplicate elements are : " + outputList);
	}

	void p3_printIndex(String str[], String findstr) {

		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(str));
		//
		System.out.println("Index of String " + findstr + " are :");
		for (int index = 0; index < inputList.size(); index++) {

			if (findstr.equals(inputList.get(index))) {
				System.out.println(index);
			}
		}
	}

	void p4_getStringStartsWithAandLengthSix(String str[], String ch, int len) {

		List<String> inputList = new ArrayList<String>(Arrays.asList(str));

		List<String> outputList = new ArrayList<String>();

		/*
		 * for(String temp: inputList ) { if(temp.startsWith(ch) && temp.length() > len)
		 * { if(!outputList.contains(temp)) { outputList.add(temp); } } }
		 * System.out.println(outputList);
		 */

		String temp = " ";

		for (int index = 0; index < inputList.size(); index++) {
			temp = inputList.get(index);
			if (temp.startsWith(ch) && temp.length() > len) {

				if (!outputList.contains(temp)) {
					outputList.add(temp);
				}
			}
		}
		System.out.println("List with A start Element and Length greater than 2 are : " + outputList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "Techno", "Aditya", "Aarav","Ahilya", "Mayur", "Chandni", "Amruta", "Chandni", "Ahilya","Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" , "Annu", "Anna"};
		System.out.println("Input String for all the programs is : " + Arrays.toString(arr) + "\n");
		Assignment_45 assignment_45 = new Assignment_45();
		System.out.println("Program 1 Output : ");
		assignment_45.p1_RemoveDuplicates(arr);
		System.out.println("\nProgram 2 Output : ");
		assignment_45.p2_getDuplicates(arr);
		System.out.println("\nProgram 3 Output : ");
		String findstrindex = "Ahilya";
		assignment_45.p3_printIndex(arr, findstrindex);
		System.out.println("\nProgram 4 Output : ");
		String ch = "A";
		int len = 4;
		assignment_45.p4_getStringStartsWithAandLengthSix(arr, ch, len);
	}

}
