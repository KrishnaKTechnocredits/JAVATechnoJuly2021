package madhavi;

public class Assignment_19_2 {
	String getMaxWordLength(String input) {
		int max = 0;
		String output = "";
		String[] inpArray = input.split(" ");
		for (int index = 0; index < inpArray.length; index++) {
			if (inpArray[index].length() > max) {
				max = inpArray[index].length();
				output = inpArray[index];
			}

		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_19_2 assignment_19_2 = new Assignment_19_2();
		System.out.println("Print maximum word length from given statement:");
		String input = "good morning technocredits hi hello";
		System.out.println(assignment_19_2.getMaxWordLength(input));

	}

}
