/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/

package amol_Vyas;

public class Assignment_40 {

	void printDigitsFromString(String input) {
		String[] output = input.split(" ");
		int digit = 0;
		System.out.println("The digits from given '"+input+"' string :");
		for (int index = 0; index < output.length; index++) {
			try {
				digit = Integer.parseInt(output[index]);
				System.out.println(digit);
			} catch (NumberFormatException ex) {

			}
		}
	}

	public static void main(String[] args) {
		String input="I have 5 years and 3 months of exp";
		Assignment_40 assignment_40 = new Assignment_40();
		assignment_40.printDigitsFromString(input);
	}
}
