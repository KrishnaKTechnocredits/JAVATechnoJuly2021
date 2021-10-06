/*Example 5 :

 Remove the longest string from given Set.*/
package monika.Assignment_46;

import java.util.Arrays;
import java.util.HashSet;

public class Program_5 {

	static void removeTheLongestString(String[] str) {
		HashSet<String> set=new HashSet<>(Arrays.asList(str));
		String maxWord="";
		for(String word:set) {
			if(maxWord.length() < word.length()) {
				maxWord=word;
			}
		}
		System.out.println("String Array: "+set);
		set.remove(maxWord);
		System.out.println("After Removing Longest String: "+set);
		
	}
	public static void main(String[] args) {
		String[] arr= {"technocredits","java","selenium","automation","manual","testing"};
		Program_5.removeTheLongestString(arr);
	}
}
