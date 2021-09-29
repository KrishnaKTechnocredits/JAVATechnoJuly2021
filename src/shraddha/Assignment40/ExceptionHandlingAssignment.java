/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3
*/
package shraddha.Assignment40;

public class ExceptionHandlingAssignment {
	public static void main(String[] args) {
		String str1 = "I have 5 years and 3 months of exp";
		String str2 = "I have 15 years and 9 months of exp";
		ExceptionHandlingAssignment newObj= new ExceptionHandlingAssignment();
		System.out.println("Digits in given statement -- "+str1+ " -- are :- ");
		newObj.getNumberFromString(str1);
		System.out.println();
		System.out.println("Digits in given statement -- "+str2+ " -- are :- ");
		newObj.getNumberFromString(str2);
	}
	
	void getNumberFromString(String str) {
		String[] stringArr = str.split(" ");

		for (int index = 0; index < stringArr.length; index++) {
			try {
				int number = Integer.parseInt(stringArr[index]);
				System.out.print(number + " ");
			} catch (NumberFormatException exception) {
			}
		}
	}
}
