/*Assignment 25 : 29th Aug'2021
Program 1:
String str = "te12ch33no3credit4s";
output = 12+33+3+4
*/

package parthav.parthavD_Assignment25;

public class SumOfDigitsInString {
	static int sum1 = 0;

	int getSumOfNumbers(String str) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else {
				if (temp.length() > 0) {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		return sum;
	}

	public final static void main(String[] args) {
		SumOfDigitsInString newObject = new SumOfDigitsInString();
		System.out.println(newObject.getSumOfNumbers("te12ch33no3credit4s"));

	}

}
