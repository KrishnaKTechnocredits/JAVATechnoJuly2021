package shalaka.codingexam1;

/*WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52*/
public class Shalaka_Scoding_Test1 {
	int getSumOfAllDigits(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	int getSumOfAllDigitOfArray(String str[]) {
		int arraySum = 0;
		for (int index = 0; index < str.length; index++) {
			int sum = getSumOfAllDigits(str[index]);
			arraySum += sum;
		}

		return arraySum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		Shalaka_Scoding_Test1 shalaka_SCodingTest_1 = new Shalaka_Scoding_Test1();
		int output = shalaka_SCodingTest_1.getSumOfAllDigitOfArray(input);
		System.out.println("Sum of all digits in array is " + output);

	}

}
