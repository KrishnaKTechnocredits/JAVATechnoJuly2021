/* Assignment-40 : 26th Sep'2021
Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3 */
package santosh_Assignment40;

public class Assignment40 {
	void findNumInString(String input) {
		String[] strArr = input.split(" ");
		int num = 0;
		System.out.println("Digits from given ["+input+"] string is: ");
		for (int index = 0; index < strArr.length; index++) {
			try {
				num = Integer.parseInt(strArr[index]);
				System.out.println(num+" ");
			} catch (NumberFormatException ne) {

			}
		}
	}

	public static void main(String[] args) {
		
		String str ="I have 5 years and 3 months of exp";
		String str1 = "I have 15 years and 9 months of exp";

		Assignment40 findNoInString40 = new Assignment40();
		findNoInString40.findNumInString(str);
		findNoInString40.findNumInString(str1);

		
	}
}
