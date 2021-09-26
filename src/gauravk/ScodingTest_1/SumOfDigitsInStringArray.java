package gauravk.ScodingTest_1;
/*
 * Surprise coding test : 26th Aug 2021

WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52

And I am going to review your code after the session time.
Do not disappoint me.

Timing : 7:45 am to 8:30 am

All the best.
Branch name : yourName_ScodingTest_1
 */
public class SumOfDigitsInStringArray {
		
	int sumOfDigitsInString(String s) {
		int sum = 0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i)))
				sum = sum+ Character.getNumericValue(s.charAt(i));
		}
		return sum;
	}
	
	int processArray(String[] sArray) {
		int totalSum = 0;
		for(int i=0; i<sArray.length; i++) {
			totalSum += sumOfDigitsInString(sArray[i]);
		}
		return totalSum;
	}
	
	public static void main(String[] a){
		String[] input = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		System.out.println("Total sum of digits in the string Array is "+new SumOfDigitsInStringArray().processArray(input));
	}
}