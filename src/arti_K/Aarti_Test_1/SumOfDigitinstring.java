package arti_K.Aarti_Test_1;

public class SumOfDigitinstring {
	
	int stringSum(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum = sum + Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;
	}

	void stringArray(String[] str) {
		int Toatalsum =0, sum =0;
		for (int index = 0; index < str.length; index++) {
				 sum = stringSum(str[index]);
				 Toatalsum = sum + Toatalsum;
			}
		System.out.println("Total Sum of digits from String Array is : "+Toatalsum);
	}

	public static void main(String[] args) {
		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		SumOfDigitinstring sum = new SumOfDigitinstring();
		sum.stringArray(input);
	}

}
