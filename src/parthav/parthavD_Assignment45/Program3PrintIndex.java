/* Assignment-45 : 2nd Oct
 program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/

package parthav.parthavD_Assignment45;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Program3PrintIndex {

	void printIndexOfAllOccurrences(String[] arr, String str) {
		List<String> inputList = new ArrayList<String>(Arrays.asList(arr));
		for (int index = 0; index < inputList.size(); index++) {
			if (str.equals(inputList.get(index))) {
				System.out.println(index);
			}
		}
	}

}
