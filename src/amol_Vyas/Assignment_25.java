/*Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali*/

package amol_Vyas;

public class Assignment_25 {

	int getSumOfNumberFromString(String input) {
		int sum = 0;
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				str += input.charAt(index);
			} else {
				if (!str.equals("")) {
					sum += Integer.parseInt(str);
					str = "";
				}
			}
		}
		return sum;
	}

	String getArrangeStringAsUpperNumberLower(String input) {
		String upper = "";
		String number = "";
		String lower = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				upper += input.charAt(index);
			} else if (Character.isLowerCase(input.charAt(index))) {
				lower += input.charAt(index);
			} else if (Character.isDigit(input.charAt(index))) {
				number += input.charAt(index);
			}
		}
		return upper + number + lower;
	}

	public static void main(String[] args) {
		String input = "te12ch33no3credit4s";
		String input1 = "Ma1U2liK";
		Assignment_25 assignment_25 = new Assignment_25();
		System.out.println("Sum of Numbers in string is " + assignment_25.getSumOfNumberFromString(input));
		System.out.println(
				"Arangement of letters from String is " + assignment_25.getArrangeStringAsUpperNumberLower(input1));
	}
}
