/*
  Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 5
         3
 */
package sayli_Vyavhare;

public class Exception_Handling_assign_40 {
	String str1 = "I have 5 years and 3 months of exp";
	String[] str = str1.split(" ");

	void getNumericValue() {

		for (int index = 0; index < str.length; index++) {
			try {
				int output = Integer.parseInt(str[index]);
				System.out.println(output);
			} catch (NumberFormatException e) {

			}
		}
	}

	public static void main(String[] args) {
		Exception_Handling_assign_40 handle = new Exception_Handling_assign_40();
		handle.getNumericValue();
	}

}
