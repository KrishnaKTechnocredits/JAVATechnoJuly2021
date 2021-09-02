package paresh.assignment25;

/*Assignment 25 : 29th Aug'2021

Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4*/

public class AdditionOfDigitInString {
	int sum = 0;
	String temp = "";

	void getSumOfNumbersinString(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
			} else if (temp != "") {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		System.out.println("Sum of concatenated numbers in the String  " + str + " is : " + "\n" + sum);
	}

	public static void main(String[] args) {
		AdditionOfDigitInString additionofdigitinstring = new AdditionOfDigitInString();
		String arr = "te12ch33no3credit4s";
		additionofdigitinstring.getSumOfNumbersinString(arr);
	}
}