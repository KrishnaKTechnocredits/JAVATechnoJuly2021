/* 12th Sep'2021 assignment is Do practice on String methods which we learn till now. 
 String class Methods :
1) char charAt(int index)
2) String valueOf(int num) : Overloaded method
3) boolean equals(String str)
4) int indexOf(char ch)
5) int lastIndexOf(char ch)
6) String toLowerCase()
7) String toUpperCase()
8) replace()
9) split
10) replaceAll
11) length
12) substring
13) compareTo
14) trim
15) startsWith
16) endsWith
17) contains
18) String intern
19) boolean isEmpty
20) String replaceFirst
21) char[] toCharArray()
22) boolean equalsIgnoreCase(String str)
23) String toString() */

package akanksha_Jain;

import java.util.Arrays;

public class PracticeStringClassMethods {

	void charAtLengthMethod(String str) {
		char ch = str.charAt(1);
		int length = str.length();
		System.out.println("The second character in string is " + ch + " and the string's length is " + length);
	}
	
	void valueOfMethod(String str) {
		String str1 = String.valueOf('h');
		if(str1.equals("c")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	void equalsMethod(String str1, String str2) {
		if(str1.equals(str2)) {
			System.out.println("String matched");
		}
		else {
			System.out.println("String not matched");
		}
	}
	
	void indexOfLastIndexOfMethod(String str) {
		int i = str.indexOf('k');
		int j = str.lastIndexOf('k');
		if(i==j) {
			System.out.println("Character is non-repeating in string");
		}
		else {
			System.out.println("Character is repeating in string");
		}
	}
	
	void toLowerCaseMethod(String str) {
		System.out.println(str.toLowerCase());
	}
	
	void toUpperCaseMethod(String str) {
		System.out.println(str.toUpperCase());
	}
	
	void replaceMethod(String str) {
		str = str.replace('e', '2');
		System.out.println(str);
	}
	
	void replaceAllMethod(String str) {
		String str1 = str.replaceAll("[a-z]*[A-Z]*", "");
		System.out.println(str1);
	}
	
	void replaceFirstMethod(String str) {
		String str1 = str.replaceFirst("a", "");
		System.out.println(str1);
	}
	
	void splitMethod(String str) {
		String[] str1 = str.split(" ");
		System.out.println(Arrays.toString(str1));
	}
	
	void trimMethod(String str) {
		String str1 = str.trim();
		System.out.println(str1);
	}
	
	void subStringMethod(String str) {
		System.out.println(str.substring(7, 11));
	}
	
	void toStringMethod(String str) {
		System.out.println(str.toString());
	}
	
	void startsWithEndsWithContainsisEmptyMethods(String str) {
		if(str.startsWith("Am"))
			System.out.println(str + " starts with Ama");
		else
			System.out.println(str + " not starts with Ama");
		if(str.endsWith("order"))
			System.out.println(str + " ends with order");
		else
			System.out.println(str + " not ends with order");
		if(str.contains("123"))
			System.out.println(str + " contains 12");
		else
			System.out.println(str + " not contains 12");
		if(str.isEmpty())
			System.out.println(str + " is empty");
		else
			System.out.println(str + " is not empty");
	}
	
	void equalsIgnoreCaseMethod(String str, String str1) {
		if(str.equalsIgnoreCase(str1))
			System.out.println("Both strings are same");
		else
			System.out.println("Both strings are not same");
	}
	
	void compareToMethod(String str, String str1) {
		System.out.println("The difference is " + str.compareTo(str1));
	}
	
	void internMethod(String str) {
		System.out.println(str.intern());
	}
	
	void charArrayMethod(String str) {
		char[] ch = str.toCharArray();
		System.out.println(Arrays.toString(ch));
	}
	
	public static void main(String[] args) {
		PracticeStringClassMethods strClassMethods = new PracticeStringClassMethods();
		strClassMethods.charAtLengthMethod("Akansha");
		strClassMethods.valueOfMethod("Technocredits");
		strClassMethods.equalsMethod("Techno", "Credits");
		strClassMethods.indexOfLastIndexOfMethod("Akanksha");
		strClassMethods.toLowerCaseMethod("TECHNO");
		strClassMethods.toUpperCaseMethod("credits");
		strClassMethods.replaceMethod("Technocredits");
		strClassMethods.replaceAllMethod("0A6k0a9n1s9h9a1");
		strClassMethods.replaceFirstMethod("Aakash");
		strClassMethods.splitMethod("I am an Engineer");
		strClassMethods.trimMethod("     Techno     ");
		strClassMethods.subStringMethod("AkanshaJain");
		strClassMethods.toStringMethod("abcd");
		strClassMethods.startsWithEndsWithContainsisEmptyMethods("Amazon123order");
		strClassMethods.equalsIgnoreCaseMethod("akansha", "AKANSHA");
		strClassMethods.compareToMethod("A", "a");
		strClassMethods.internMethod("Akansha");
		strClassMethods.charArrayMethod("Akansha Jain");
	}
}