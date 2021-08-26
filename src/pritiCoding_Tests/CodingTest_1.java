package pritiCoding_Tests;

public class CodingTest_1 {
	int findSumOFAllDigitInString(String str) {
		int sum = 0;	
		for(int index=0; index<str.length(); index++) {
			char ch= str.charAt(index);
			if (Character.isDigit(ch)) {
				sum =sum+Character.getNumericValue(ch);
			}
		}	
		return sum;
	}
	
	int findSumOfAllDigit(String[] input) {
		int sum1 =0;
		for (int index=0; index<input.length;index++) {
			sum1= sum1+ findSumOFAllDigitInString(input[index]);
		}
		return sum1;
	}
		
	public static void main(String[] a) {
		CodingTest_1 codingTest_1 = new CodingTest_1();
		String input[] = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		System.out.println("Sum of all digits in given String array is = " +codingTest_1.findSumOfAllDigit(input));
	}
}