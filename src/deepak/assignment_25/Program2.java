/*Assignment 25 : 29th Aug'2021
Program 1:
String str = "te12ch33no3credit4s";
output = 12+33+3+4*/

package deepak.assignment_25;

import java.util.Arrays;

import javax.xml.bind.ParseConversionEvent;

public class Program2 {
	void CharChange(String str) {
		String temp1 = "";
		String temp2 = "";
		String temp3 = "";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)) {
				temp1 = temp1+ch;
			}else if(Character.isDigit(ch)) {
				temp2 = temp2+ch;
			}else if(Character.isLowerCase(ch)) {
				temp3 = temp3+ch;
			}
		}
		System.out.println(temp1+temp2+temp3);;
	}

	public static void main(String[] args) {
		Program2 obj = new Program2();
		obj.CharChange("Ma1U2liK");		
	}

}