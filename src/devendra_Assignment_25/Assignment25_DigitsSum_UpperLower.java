/*
Assignment 25 : 29th Aug'2021

Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali
*/

package devendra_Assignment_25;

public class Assignment25_DigitsSum_UpperLower {
	/*Program1*/
	int getSum(String str1) {
		int sum = 0;
		String temp = "0";
		for(int index = 0; index < str1.length(); index++) {
			char ch = str1.charAt(index);
			if(Character.isDigit(ch)) {
				temp += ch;
			}else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum;
	}
	
	/*Program2*/
	void getUpperLowerDigitInString(String str2) {
		String capital = "";
		String small = "";
		String digit = "";

		for(int index = 0; index < str2.length(); index++) {
			char ch = str2.charAt(index);
			if(Character.isDigit(ch)) {
				digit += ch;
			}else 
			if(Character.isUpperCase(ch)) {
				capital += ch;
			}else 
				if(Character.isLowerCase(ch))
				small += ch;
		}
		System.out.print("After Rearranging, String = "+capital+digit+small);
	}
	
	public static void main(String[] args) {
		Assignment25_DigitsSum_UpperLower digitsSum_UpperLower = new Assignment25_DigitsSum_UpperLower();
		String str1 = "te12ch33no3credi4s";
		System.out.println("In String = "+str1+" , Sum of Digits = "+digitsSum_UpperLower.getSum(str1)+ "\n --------------------------");
		
		String str2 = "Ma1U2liK";
		System.out.print("Before Rearranging, String = "+str2+"\n");
		digitsSum_UpperLower.getUpperLowerDigitInString(str2);
	}
}
