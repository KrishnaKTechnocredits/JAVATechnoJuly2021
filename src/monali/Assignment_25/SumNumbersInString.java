package monali.Assignment_25;

/*Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4
*/
public class SumNumbersInString {

	void sumStringNumbers(String str) {

		int sum = 0;
		String input = "";

		for (int index = 0; index < str.length(); index++) {

			if (Character.isDigit(str.charAt(index))) {
				input += str.charAt(index);
			} else if (input != "" && !Character.isDigit(str.charAt(index))) {
				sum += Integer.parseInt(input);
				input = "";
			}
		}
		System.out.println("Sum of Numbers present in string : "+sum);
	}

	public static void main(String[] args) {
		new SumNumbersInString().sumStringNumbers("te12ch33no3credit4s");

	}
}
