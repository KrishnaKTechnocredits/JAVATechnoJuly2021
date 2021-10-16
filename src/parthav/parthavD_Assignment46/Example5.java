/*Programming Questions - Collections : 4th Oct'2021
 * Example 5 :
Remove the longest string from given Set.
*/

package parthav.parthavD_Assignment46;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Iterator;

public class Example5 {

	void removeLongestString(String str) {
		String longestString = "";
		int lengthLongestString = 0;
		String[] strArray = str.split(" ");
		Set<String> set = new LinkedHashSet<String>(Arrays.asList(strArray));
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String setStr = itr.next();
			if (lengthLongestString < setStr.length()) {
				longestString = setStr;
				lengthLongestString = setStr.length();
			}
		}
		set.remove(longestString);
		
		System.out.println("The original string is: " + str);
		System.out.println("The set with longest string removed is: ");
		System.out.println(set);
	}

	public static void main(String[] args) {
		Example5 newObject = new Example5();
		String str = "The biggest String here in this sentence is Alpharomeo";
		System.out.println();
		newObject.removeLongestString(str);

	}

}
