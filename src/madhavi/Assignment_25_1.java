package madhavi;

public class Assignment_25_1 {

	int getSumOfDigits(String str) {
		int sum = 0;
		String temp = "";

		for (int index = 0; index < str.length(); index++) {

			if (Character.isDigit(str.charAt(index))) {
				temp = temp + String.valueOf(str.charAt(index));

			} else {
				if (temp != "") {
					sum = sum + Integer.parseInt(temp);
				}
				temp = "";
			}
		}
		// Logic for trailing numbers for example str1 from Main()....
		if (temp != "") {
			sum = sum + Integer.parseInt(temp);
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment_25_1 assignment_25_1 = new Assignment_25_1();
		String str = "te12ch33no3credit4s";
		System.out.println(assignment_25_1.getSumOfDigits(str));
		//String str1 = "5tech1234no5ced10";
		//System.out.println(assignment_25_1.getSumOfDigits(str1));

	}
}
