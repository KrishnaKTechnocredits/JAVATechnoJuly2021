/*String str = "Ma1U2liK"
output : MUK12ali
*/
package amol_Vyas;

public class ScodingTest_2 {

	String getUpperNumberLower(String input) {
		String upper = "";
		String lower = "";
		String number = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				upper += String.valueOf(input.charAt(index));
			} else if (Character.isLowerCase(input.charAt(index))) {
				lower += String.valueOf(input.charAt(index));
			} else if (Character.isDigit(input.charAt(index))) {
				number += String.valueOf(input.charAt(index));
			}
		}
		return upper + number + lower;
	}

	public static void main(String[] args) {
		String input = "Ma1U2liK";
		ScodingTest_2 ScodingTest_2 = new ScodingTest_2();
		System.out.println(ScodingTest_2.getUpperNumberLower(input));
	}

}
