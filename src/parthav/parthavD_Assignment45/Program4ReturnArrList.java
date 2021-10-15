/* Assignment-45 : 2nd Oct
program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/

package parthav.parthavD_Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Program4ReturnArrList {

	ArrayList<String> getArrayList(String[] arr) {
		ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
		ArrayList<String> outputArrList = new ArrayList<>();
		for (String elem : arrList) {
			if (elem.startsWith("A") && elem.length() > 6) {
				if (!outputArrList.contains(elem))
					outputArrList.add(elem);
			}
		}

		return outputArrList;
	}

}
