package neha.assignment_22;

/*Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/
public class Assignment22pg2 {
	int totalSumOfDigits(String strInp) {
		int totalDigitSum = 0;
		for (int index = 0; index < strInp.length(); index++) {
			char ch = strInp.charAt(index);
			if (Character.isDigit(ch))
				totalDigitSum += Character.getNumericValue(ch);
		}
		return totalDigitSum;
	}

	public static void main(String[] args) {
		Assignment22pg2 assignment22pg2 = new Assignment22pg2();
		String str = "Te11ch2no3cr4edi2ts";
		System.out.println("Sum of all digits is: " + assignment22pg2.totalSumOfDigits(str));
	}
}
