/*Program  that requires exception handling ...
	String str = "I have 5 years and 3 months of exp";
	str = "I have 15 years and 9 months of exp";
	output : 15
	         3
*/
package deepak.assignment_40;

import java.lang.reflect.Array;

public class ExceptionHandling {

	void getExp(String str) {
		String[] str1 = str.split(" ");
		int temp = 0;
		for (int index = 0; index < str1.length; index++) {
			try {
				temp = Integer.parseInt(str1[index]);
				System.out.println(temp);
			} catch (NumberFormatException ne) {
				// System.out.println("Not an Integer");
			}

		}
	}

	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();
		obj.getExp("I have 15 years and 3 months of exp");
	}

}
