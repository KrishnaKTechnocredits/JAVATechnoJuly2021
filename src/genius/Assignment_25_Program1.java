package genius;

public class Assignment_25_Program1 {
	
	void getSum(String input) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index<input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp = temp + input.charAt(index);
			} else {
				if (!temp.equals("")) {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		System.out.println("The sum of numbers in a string is " + sum);
	}

	public static void main(String[] args) {
		String input = "te12ch33no3credit4s";
		Assignment_25_Program1 assignment_25_Program1 = new Assignment_25_Program1();
		assignment_25_Program1.getSum(input);

	}

}
