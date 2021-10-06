package devendra_Assignment_42;

public class Assignment42_RemoveDuplicates {
	void removeDuplicate(String str) {
		String output = "";
		for(int index = 0; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index)) == index)
				output = output + str.charAt(index);
		}
		System.out.println("Output String after removing multiple occurrences in \"" + str + "\" is " + output);
	}

	void removeAllDuplicates(String str) {
		String str1 = str;
		for(int index = 0; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index)) != str.lastIndexOf(str.charAt(index)))
				str = str.replaceAll(String.valueOf(str.charAt(index)), "");
		}
		System.out.println("Output String after removing all duplicate characters is \"" + str1 + "\" is " + str);
	}

	public static void main(String args[]) {
		Assignment42_RemoveDuplicates obj = new Assignment42_RemoveDuplicates();
		String str = "technocredits";
		obj.removeDuplicate(str);
		obj.removeAllDuplicates(str);
	}
}

/*
Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"
*/