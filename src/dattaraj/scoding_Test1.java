package dattaraj;

public class scoding_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scoding_Test1 test = new scoding_Test1();
		String[] inputArray = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		System.out.println("The total sum = "+test.getSumOfnumInArray(inputArray));
	}

	int getSumOfDigits(String inputArray) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=0;i<inputArray.length();i++) {
			if(Character.isDigit(inputArray.charAt(i))) {
				sum += Character.getNumericValue(inputArray.charAt(i));
			}
		}
		return sum;
	}
	
	int getSumOfnumInArray(String[] input) {
		// TODO Auto-generated method stub
		int totalSum =0;
		for(int index=0; index<input.length; index++)
			totalSum += getSumOfDigits(input[index]);
		return totalSum;
	}

}
