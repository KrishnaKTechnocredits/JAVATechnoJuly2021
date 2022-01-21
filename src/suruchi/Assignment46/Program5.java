//Remove the longest string from given Set.

package suruchi.Assignment46;

import java.util.HashSet;
import java.util.Iterator;

public class Program5 {

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
		Program5 program5 = new Program5();
		
		HashSet<String> nameList = new HashSet<String>();
		nameList.add("Astha");
		nameList.add("Swati");
		nameList.add("Akanksha");
		nameList.add("technocredits");
		nameList.add("ray");
		System.out.println("List before removing the longest string : " +nameList);
		program5.removeLongestString(nameList);
	}
}