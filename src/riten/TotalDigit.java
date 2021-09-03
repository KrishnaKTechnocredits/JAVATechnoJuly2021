package riten;

class TotalDigit {

	void digitCount(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum++;
			}
		}
		System.out.println("Total digit sum in string is:" + sum);

	}

	public static void main(String[] args) {
		TotalDigit total = new TotalDigit();
		total.digitCount("Te1ch2no3cr4ed3it4s");

	}

}