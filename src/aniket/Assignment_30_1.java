package aniket;

public class Assignment_30_1 {
	int getReverseNumber(int input) {
		int revNumber = 0;
		//int temp = input;

		while (input != 0) {
			int lastIndex = input % 10; // 2
			revNumber = revNumber * 10 + lastIndex;
			input = input / 10;
		}
		return revNumber;

	}

	public static void main(String[] args) {
		System.out.println("The reverse number is : " + new Assignment_30_1().getReverseNumber(1932));

	}
}
