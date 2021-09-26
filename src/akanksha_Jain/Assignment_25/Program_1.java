/* Assignment 25 : 29th Aug'2021
Program 1:
String str = "te12ch33no3credit4s";
output = 12+33+3+4
*/

package akanksha_Jain.Assignment_25;

public class Program_1 {
	
	void getSum(String input) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index<input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp = temp + input.charAt(index);
			} else {
				if (!temp.equals("")) {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		System.out.println("The sum of numbers in a string is- " + sum);
	}

	public static void main(String[] args) {
		String input = "te12ch33no3credit4s";
		Program_1 program_1 = new Program_1();
		program_1.getSum(input);
	}
}
