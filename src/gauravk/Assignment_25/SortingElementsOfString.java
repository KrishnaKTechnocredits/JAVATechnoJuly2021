package gauravk.Assignment_25;
/*
 * Assignment 25 : 29th Aug'2021

Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali
 */
public class SortingElementsOfString {
	
	void sortingStringElements(String str) {
		String s = "";
		String s1 ="";
		String s2 = "";
		String s3 = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				s = s + Character.toString(ch);
			}
		}
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				s = s + Character.toString(ch);
			}
		}
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) {
				s = s + Character.toString(ch);
			}
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		String input = "Ma1U2liK";
		new SortingElementsOfString().sortingStringElements(input);
	}
}
