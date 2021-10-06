/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/
package shalaka.Assignment40;

public class ExceptionHandling {
	void findNumbers(String str) {
		String[] str1 = str.split(" ");
		for (int index = 0; index < str1.length; index++) {
			try {
				int num = Integer.parseInt(str1[index]);
				System.out.println(num);
			} catch (NumberFormatException ne) {

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The year of experience in String: I have 5 years and 3 months of exp ");
		String str = "I have 5 years and 3 months of exp";
		ExceptionHandling exceptionHandling = new ExceptionHandling();
		exceptionHandling.findNumbers(str);
		System.out.println("The year of experience in String: I have 15 years and 9 months of exp ");
		String str1 = "I have 15 years and 9 months of exp";
		//ExceptionHandling exceptionHandling = new ExceptionHandling();
		exceptionHandling.findNumbers(str1);
	}

}
