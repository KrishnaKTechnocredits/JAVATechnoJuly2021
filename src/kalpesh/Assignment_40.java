/*Assignment-40 : 26th Sep'2021
Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3
*/

package kalpesh;

public class Assignment_40 {
	void checkNumInString(String str) {
		String[] strNum = str.split(" ");
		for (int i = 0; i < strNum.length; i++) {
			try {
				int num = Integer.parseInt(strNum[i]);
				System.out.println(num);
			} catch (NumberFormatException ne) {

			}
		}
	}

	public static void main(String[] arg) {
		Assignment_40 assignment = new Assignment_40();
		String str = "I have 5 years and 3 months of exp";
		String str1 = "I have 15 years and 9 months of exp";
		assignment.checkNumInString(str);
		assignment.checkNumInString(str1);
	}
}
