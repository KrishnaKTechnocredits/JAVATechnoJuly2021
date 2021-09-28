/*Assignment 25 : 29th Aug'2021
Program 1:
String str = "te12ch33no3credit4s";
output = 12+33+3+4*/

package deepak.assignment_25;

import java.util.Arrays;

import javax.xml.bind.ParseConversionEvent;

public class Program1 {
	int sumOfNumbers(String str) {
		String temp = "";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				temp = temp + str.charAt(index);
			} else if (temp.length() > 0) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		Program1 obj = new Program1();
		System.out.print("Sum of digits in the String is: ");
		System.out.println(obj.sumOfNumbers("te12ch33no3credit4s"));

	}

}