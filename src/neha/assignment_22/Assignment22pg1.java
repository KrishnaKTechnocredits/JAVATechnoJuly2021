package neha.assignment_22;

/*Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6*/
public class Assignment22pg1 {
	int totalDigitCount(String strInp) {
		int totalDigitCount = 0;
		for (int index = 0; index < strInp.length(); index++) {
			char ch = strInp.charAt(index);
			if (Character.isDigit(ch))
				totalDigitCount++;
				//totalDigitCount += Character.getNumericValue(ch);
		}
		return totalDigitCount;
	}

	public static void main(String[] args) {
		Assignment22pg1 assignment22pg1 = new Assignment22pg1();
		String str = "Te1ch2no3cr4ed3it4s";
		System.out.println("Total Digit Count is: " + assignment22pg1.totalDigitCount(str));
	}
}
