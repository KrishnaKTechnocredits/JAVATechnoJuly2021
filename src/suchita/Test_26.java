package suchita;
 class Test_26 {

	private int getSumOfString(String arr) {
		int sum=0;
		for(int index=0;index<arr.length();index++) {
			if(Character.isDigit(arr.charAt(index))) {
				sum += Character.getNumericValue(arr.charAt(index));
			}
		}
		return sum;
	}

	int getSumOfArray(String[] input) {
		int sum=0;
		for(int index=0;index<input.length;index++) {
			sum += getSumOfString(input[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] input = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		Test_26 test_26 = new Test_26();
		System.out.println("Sum of all the digit available in String array is "+test_26.getSumOfArray(input));

	}


}