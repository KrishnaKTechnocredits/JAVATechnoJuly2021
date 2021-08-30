package shweta_Dharmadhikari.string_Assignemnet_25;
/*
 * Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4
 */

class SumOfDigitsGivenFromTheString {
	int SumOfDigits(String input) {
		String temp = "0";
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp += input.charAt(index);
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}

		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "te12ch33no3credit4s";
		SumOfDigitsGivenFromTheString sumOfDigitsGivenFromTheString = new SumOfDigitsGivenFromTheString();
		System.out.println("Output is :" + sumOfDigitsGivenFromTheString.SumOfDigits(str));
	}

}
