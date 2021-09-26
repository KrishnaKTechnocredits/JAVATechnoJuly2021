package amol_Pawar.assignment_37;

public class Assignment_37 {

	void getSecondLargeWord(String input) {
		String maxLengthWord = "";
		String secondMaxLengthWord = "";
		String arr[] = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxLengthWord.length()) {
				secondMaxLengthWord = maxLengthWord;
				maxLengthWord = arr[index];
			} else if (arr[index].length() > secondMaxLengthWord.length()) {
				secondMaxLengthWord = arr[index];
			}
		}
		System.out.println("Secondmax length word from String " + input + " is : " + secondMaxLengthWord);
	}

	public static void main(String[] args) {
		Assignment_37 assignment_37 = new Assignment_37();
		String input = "Welcome to the family";
		assignment_37.getSecondLargeWord(input);

	}

}
