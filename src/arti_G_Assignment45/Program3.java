package arti_G_Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4 */

public class Program3 {

	void printIndex(ArrayList<String> names) {
		System.out.println("Output with all occurrences of Akanksha :");
		for(int index = 0; index < names.size(); index++) {
			if(names.get(index).equals("Akanksha"))
				System.out.print(index + " ");
		}

	}

	public static void main(String[] args) {
		Program3 obj = new Program3();
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"));
		System.out.println("Input list " + names);
		obj.printIndex(names);


	}

}
