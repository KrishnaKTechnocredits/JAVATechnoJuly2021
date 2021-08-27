package madhavi;

public class Assignment_17 {
	String getReverseString(String input) {
		char[] ch = input.toCharArray();
		String reverse = "";

		for (int index = ch.length - 1; index >= 0; index--) {
			reverse = reverse + ch[index];
		}

		return reverse;
	}

	public static void main(String[] args) {
		Assignment_17 assignment_17 = new Assignment_17();
		System.out.println("Print a reverse string of given input :");
		System.out.println(assignment_17.getReverseString("technocredits"));

	}
}