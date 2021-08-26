package gauravk.Assignment_22;
/*
 * Assignment - 22 : 25th Aug'2021

Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13
 */
public class FindingTotalDigitsInString {
	
	int countingDigitsInString(String s) {
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i)))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str = "Te1ch2no3cr4ed3it4s";
		System.out.println("Total digits found in the string ["+str+"] is "+new FindingTotalDigitsInString().countingDigitsInString(str));
	}
}
