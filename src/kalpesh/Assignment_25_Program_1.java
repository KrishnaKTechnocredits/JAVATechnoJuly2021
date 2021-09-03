package kalpesh;

public class Assignment_25_Program_1 {

	void sumOfStringNum(String input) {
		int sum = 0;
		String str = "";

		for (int index = 0; index < input.length(); index++) {

			if (index < input.length() && Character.isDigit(input.charAt(index))) {
				str = str + input.charAt(index);
			} else {
				if (str != "")
					sum = sum + Integer.parseInt(str);
				str = "";
			}
		}
		System.out.println("Sum of all the numbers from a given String is : " + sum);
	}

	public static void main(String[] args) {
		String str = "te12ch33no3credit4s";
		Assignment_25_Program_1 program1 = new Assignment_25_Program_1();
		program1.sumOfStringNum(str);
	}

}

/*
 * Program 1: String str = "te12ch33no3credit4s"; 
 * output = 12+33+3+4 = 52
 */
