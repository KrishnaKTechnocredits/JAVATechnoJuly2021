package shalaka.Assignment22;

/*Assignment - 22 : 25th Aug'2021

Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s"
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts"
output : 13*/
public class TotalDigit {
	int getTotalDigits(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Te1ch2no3cr4ed3it4s";
		TotalDigit totalDigit = new TotalDigit();
		int count = totalDigit.getTotalDigits(str);
		System.out.println("Total digits in a given string is " + count);
	}
}
