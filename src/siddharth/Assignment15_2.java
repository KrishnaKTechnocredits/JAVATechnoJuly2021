package siddharth;

public class Assignment15_2 {
	char charAt(String[] input) {

		char[] arr = new char[3];

		for (int index = 0; index < input.length; index++) {
			String temp = input[index];
			if (temp.length() % 2 == 0) {
				arr[index] = temp.charAt(temp.length() / 2 - 1);
				System.out.println("Middle Charcter of "+ temp + " is " + arr[index]);
			} else {
				arr[index] = temp.charAt(temp.length() / 2);
				System.out.println("Middle Charcter of "+ temp + " is " + arr[index]);
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		String[] input = { "hello", "techno", "credits" };

		Assignment15_2 program2 = new Assignment15_2();
		program2.charAt(input);

	}
}
