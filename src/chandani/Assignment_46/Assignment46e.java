/*Example 5 :
Remove the longest string from given Set.*/
package chandani.Assignment_46;

import java.util.HashSet;
import java.util.Iterator;


public class Assignment46e {

	void getLongestString(HashSet<String> inputString) {
		String longestString = "";
		Iterator<String> iterator = inputString.iterator();
		while(iterator.hasNext()){
			String input = iterator.next();
			if(input.length() > longestString.length())
				longestString = input;
		}
		inputString.remove(longestString);
		System.out.println("Longest String " + longestString + " whose length is " + longestString.length() + " is removed from the list and the list now is \n" + inputString +"\n");
		}

	public static void main(String[] args) {
		Assignment46e removeLong = new Assignment46e();
		HashSet<String> str = new HashSet<String>();
		str.add("Chandani");
		str.add("Husain");
		str.add("Deepak");
		str.add("Technocredits");
		str.add("Maulik");
		str.add("Krishna");
		System.out.println("Current List : " + str + "\n");
		removeLong.getLongestString(str);
	}

	
}
