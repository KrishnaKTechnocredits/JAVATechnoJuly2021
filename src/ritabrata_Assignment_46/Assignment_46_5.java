/*Example 5 :
Remove the longest string from given Set.
*/

package ritabrata_Assignment_46;


import java.util.HashSet;
import java.util.Iterator;

public class Assignment_46_5 {
	void removeLongestString(HashSet<String> inputString) {
		String longestString = "";
		Iterator<String> iterator = inputString.iterator();
		while(iterator.hasNext()){
			String input = iterator.next();
			if(input.length() > longestString.length())
				longestString = input;
		}
		inputString.remove(longestString);
		System.out.println(longestString + " : length = " +longestString.length() + " is removed from the list : " +inputString);
		}

	public static void main(String[] args) {
		Assignment_46_5 removeLong = new Assignment_46_5();
		HashSet<String> nameList = new HashSet<String>();
		nameList.add("Ritabrata");
		nameList.add("Swati");
		nameList.add("Saptarshi");
		nameList.add("technocredits");
		nameList.add("ray");
		System.out.println("List before removing the longest string is : " +nameList);
		removeLong.removeLongestString(nameList);
	}

}
