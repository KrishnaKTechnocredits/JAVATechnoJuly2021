package monali;

public class SumNumArrayString {
	/*
	 * program 4: sum of all numbers in given statement. input = "10 10 20 30";
	 * output : 70
	 */
	int getSumOfNum(String input) {
		String[] str = input.split(" ");
		int sum = 0;
		for (int index = 0; index < str.length; index++) {
			sum = sum + Integer.parseInt(str[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		String input = "10 10 20 30";
		SumNumArrayString sumOfAll = new SumNumArrayString();
		System.out.println(sumOfAll.getSumOfNum(input));

	}
}
