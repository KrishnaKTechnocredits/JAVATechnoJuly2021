package madhavi;

public class Assignment_40 {
	void getNumberFromString(String input) {
		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			try {
				int number = Integer.parseInt(arr[index]);
				System.out.print(number + " ");
			} catch (NumberFormatException exception) {
			}
		}
	}

	public static void main(String[] args) {
		Assignment_40 assignment_40 = new Assignment_40();
		String str = "I have 15 years and 9 months of exp";
		assignment_40.getNumberFromString(str);

	}
}