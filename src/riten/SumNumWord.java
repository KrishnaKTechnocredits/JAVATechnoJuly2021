package riten;

class SumNumWord {

	void getMaximumWord(String str) {
		int sum = 0;
		String[] noOfWords = str.split(" ");
		int[] arr = new int[noOfWords.length];

		for (int i = 0; i < noOfWords.length; i++) {
			arr[i] = Integer.parseInt(noOfWords[i]);
			sum = sum + arr[i];
		}
		System.out.println("Sum of given String: " + sum);

	}

	public static void main(String[] args) {
		SumNumWord sumnum = new SumNumWord();
		String input = "10 10 20 30";
		sumnum.getMaximumWord(input);

	}
}