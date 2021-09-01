/*Assignment 25 : 29th Aug'2021

Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali*/


package astha.Assignment25;

public class Assignment25 {

	int getSumOfDigitsInString(String input) {
		int sum = 0;
		String temp = "";
		for(int index=0; index<input.length();index++) {
			if(Character.isDigit(input.charAt(index)))
				temp += input.charAt(index);
			else if(temp != "") {
				sum = sum + Integer.parseInt(temp);
					temp = "";
				}
		}
		return sum;
	}
	
	String arrangeString(String input) {
		String output = "";
		String upperCaseString = "";
		String lowerCaseString = "";
		String otherString = "";
		for(int index=0; index<input.length();index++) {
			if(Character.isLowerCase(input.charAt(index)))
				lowerCaseString += input.charAt(index);
			else if (Character.isUpperCase(input.charAt(index)))
				upperCaseString += input.charAt(index);
			else
				otherString += input.charAt(index);
		}
		output = upperCaseString+otherString+lowerCaseString;
		return output;
		
	}
	
	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		System.out.println("The sum of digits in the input string is :" +assignment25.getSumOfDigitsInString("te12ch33no3credit4s"));
		System.out.println("The rearrange string for Ma1U2liK is "+assignment25.arrangeString("Ma1U2liK"));
	}
}
