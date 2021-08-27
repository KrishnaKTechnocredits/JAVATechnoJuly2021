package riten;

class CalculateSumOfDigit {

	void returnSum(String[] arr) {
		int sum = 0;
		String temp;
		char ch;
		for (int index = 0; index < arr.length; index++) {
			temp = arr[index];
			for (int input1 = 0; input1 < temp.length(); input1++) {
				ch = temp.charAt(input1);
				if (Character.isDigit(ch)) {

					sum += Character.getNumericValue(ch);

				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		CalculateSumOfDigit caldigit = new CalculateSumOfDigit();
		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		caldigit.returnSum(input);

	}

}