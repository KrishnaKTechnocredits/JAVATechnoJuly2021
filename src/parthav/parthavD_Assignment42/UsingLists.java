/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/

/*<<<<<<<Approach using ArrayLists>>>>>>>>>>>>>>*/

package parthav.parthavD_Assignment42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingLists {

	List<Character> al = new ArrayList<Character>();
	List<Character> ouList = new ArrayList<Character>();

	private void convertStringToList(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			al.add(ch);
		}
	}

	void printOnlyUnique(String str) {
		convertStringToList(str);
		for (Character ch : al) {
			if (!ouList.contains(ch)) {
				ouList.add(ch);
			}
		}

		for (Character ch : ouList) {
			System.out.print(ch);
		}
	}
	
	void removeAllDuplicates(String str) {
		convertStringToList(str);
		for (Character ch : al) {
			if (ouList.contains(ch)) {
				ouList.remove(ch);
			}
			else{
				ouList.add(ch);
			}
		}

		for (Character ch : ouList) {
			System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		UsingLists newObj = new UsingLists();
		String str = "technocredits";
		newObj.printOnlyUnique(str);
		System.out.println();
		UsingLists newObj1 = new UsingLists();
		newObj1.removeAllDuplicates(str);
	}

}
