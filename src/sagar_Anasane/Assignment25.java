/*Assignment 25 : 29th Aug'2021

Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali*/
package sagar_Anasane;

public class Assignment25 {
	int sum = 0;
	String str = "";
	int convert;
	void methodToDeletCharactersAmongString (String input) {
		for (int index = 0; index<input.length();index++) {
				char ch = input.charAt(index);
				if(Character.isDigit(ch)) {
					str = str + ch;
				}else if(!str.equals("")) {
					convert = Integer.parseInt(str);
					sum = sum +convert;
					str = "";
				}
		}
		System.out.println(sum);
	}
	
	void methodToArrangeGivenStringInSortedFormat(String input) {
		String upper="";
		String lower ="";
		String num ="";
		for(int index =0; index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				upper = upper +ch;
			}
			if(Character.isLowerCase(ch)) {
				lower = lower + ch;
			}
			if(Character.isDigit(ch)) {
				num = num+ch;
			}
		}
		System.out.println(upper+num+lower);
	}
	
	public static void main(String[] args) {
		String str1 = "te12ch33no3credit4s";
		String str2 = "Ma1U2liK";
		Assignment25 assignment25 = new Assignment25();
		assignment25.methodToDeletCharactersAmongString(str1);
		assignment25.methodToArrangeGivenStringInSortedFormat(str2);
	}
}
