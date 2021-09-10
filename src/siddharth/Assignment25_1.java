package siddharth;

public class Assignment25_1 {
	int sumOfNumbersInString(String str) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				temp += str.charAt(index);
			else if (!temp.equals("")) {
				sum += Integer.parseInt(temp);
				temp = "";
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment25_1 assignment25_1 = new Assignment25_1();
		String str = "te12ch33no3credit4s";
		System.out.println(assignment25_1.sumOfNumbersInString(str));
	}
}
