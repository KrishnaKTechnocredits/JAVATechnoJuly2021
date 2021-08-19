package husain;

public class Assignment_15_Program1 {

	int calcDifference(String[] arr) {
		int evenLength = 0;
		int oddLength = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0)
				evenLength = evenLength + arr[index].length();
			else
				oddLength = oddLength + arr[index].length();
		}

		if (evenLength > oddLength)
			return evenLength - oddLength;
		else
			return oddLength - evenLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_15_Program1 obj = new Assignment_15_Program1();
		String input[] = { "Maulik", "Techno", "Nidhi", "Ankit" };
		int output = obj.calcDifference(input);
		System.out.println("The difference between even length names and odd length names is: " + output);

	}

}
