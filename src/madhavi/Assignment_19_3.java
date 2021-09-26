package madhavi;

public class Assignment_19_3 {
	String getMinWordLength(String input) {

		String[] inpArray = input.split(" ");
		String output = inpArray[0];
		for (int index = 1; index < inpArray.length; index++) {
			if (output.length() > inpArray[index].length()) {
				output = inpArray[index];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_19_3 assignment_19_3 = new Assignment_19_3();
		System.out.println("Print minimum word length from given statement:");
		String input = "good morning technocredits hi hello";
		System.out.println(assignment_19_3.getMinWordLength(input));

	}

}
