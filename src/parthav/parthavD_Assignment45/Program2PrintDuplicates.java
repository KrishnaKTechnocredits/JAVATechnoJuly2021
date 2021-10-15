/* Assignment-45 : 2nd Oct
Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]
 */

package parthav.parthavD_Assignment45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2PrintDuplicates {

	void printDuplicates(String[] arr) {
		List<String> listInput = new ArrayList<String>(Arrays.asList(arr));
		List<String> listOutput = new ArrayList<String>();

		for (int index = 0; index < listInput.size(); index++) {
			String str = listInput.get(index);
			if (listInput.indexOf(str) != listInput.lastIndexOf(str)) {
				if (!listOutput.contains(str))
					listOutput.add(str);
			}
		}

		System.out.println(listOutput);

	}

}
