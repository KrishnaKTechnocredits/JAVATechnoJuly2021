/*
 * Assignment-40 : 26th Sep'2021
 
Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3
 */
package husain.Assignment40;

public class FindYear {

	void findNum(String str) {

		int year = 0;
		String arr[] = str.split(" ");

		for (int index = 0; index < arr.length; index++) {
			try {
				year = Integer.parseInt(arr[index]);
				System.out.print(year + " ");
			} catch (NumberFormatException ne) {
				continue;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindYear year = new FindYear();
		String str = "I have 5 years and 3 months of exp";
		System.out.println("The years of experience in the given string " + str + " is ");
		year.findNum(str);

		String str1 = "I have 15 years and 9 months of exp";
		System.out.println("\n\nThe years of experience in the given string " + str1 + " is ");
		year.findNum(str1);

	}

}
