/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15 and 9
         5 and 3*/
		 

package astha.Assignment40;

public class Assignment40 {

	void getDigitsFromString(String input) {
		String[] inputArr = input.split(" ");
		int number = 0;
		for (int index = 0; index < inputArr.length; index++) {
			try {
				number = Integer.parseInt(inputArr[index]);
				System.out.println(number);
			} catch (NumberFormatException ex) {

			}
		}
	}

	public static void main(String[] args) {
		String input = "I have 9 years and 2 months of exp";
		Assignment40 assignment40 = new Assignment40();
		assignment40.getDigitsFromString(input);
	}
}
