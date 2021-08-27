package himanshu;

public class Assignment_15_Program1 {

	int difference;
	int evenLength;
	int oddLength;

	void diffLengthName(String[] arr) {

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0) {
				evenLength = evenLength + arr[index].length();
			} else {
				oddLength = oddLength + arr[index].length();
			}
		}
	}

	void difference() {
		difference = evenLength - oddLength; // 12 - 8 = 4
		System.out.println("Difference of even length name and odd lenght name: " + difference);
	}

	public static void main(String[] args) {

		String[] arr = { "Maulik", "Techno", "Ram", "Lucky" };

		Assignment_15_Program1 program1 = new Assignment_15_Program1();
		program1.diffLengthName(arr);
		program1.difference();

	}

}
