/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/

/*<<<<<<<Approach using Strings>>>>>>>>>>>>>>*/


package parthav.parthavD_Assignment42;

public class UsingStrings {
	
	void removeDuplicates(String str) {
	
		String newStr = "";
		for (int index = 0;index < str.length();index++){
			String ch = String.valueOf(str.charAt(index));
			if(!newStr.contains(ch)){
				newStr += ch;
			}
		}
		
		System.out.println(newStr);
		
	}
	
	void removeAllDuplicates(String str){
		String newStr = "";
		for (int index = 0;index < str.length();index++){
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)){
				newStr += String.valueOf(ch);
			}
		}
		
		System.out.println(newStr);
	}

	public static void main(String[] args) {
		UsingStrings newObj = new UsingStrings();
		String str = "technocredits";
		newObj.removeDuplicates(str);
		newObj.removeAllDuplicates(str);

	}

}