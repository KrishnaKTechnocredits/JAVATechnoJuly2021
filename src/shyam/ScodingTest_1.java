package shyam;

public class ScodingTest_1 {
	
	int sumOfDegitsInString(String inputString) {
		
		int sumOfDegits = 0;
		for(int index=0;index<inputString.length();index++) {
			if (Character.isDigit(inputString.charAt(index))) {
				sumOfDegits += Character.getNumericValue(inputString.charAt(index));	
			}
		}
		return sumOfDegits;
	}
	
	int sumOfDigitsInArray(String[] arrayInput) {
		int totalSum = 0;
		for (int index = 0; index < arrayInput.length; index++) {
			totalSum += sumOfDegitsInString(arrayInput[index]);
		}
		return totalSum;
	}
	
	public static void main(String[] args) {
		String[] inputString = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		ScodingTest_1 scodingtest =new ScodingTest_1();
		int totalSum = scodingtest.sumOfDigitsInArray(inputString);
		System.out.println("Sum of degits in array is->" + totalSum);
	}

}
