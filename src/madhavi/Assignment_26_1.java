package madhavi;

public class Assignment_26_1 {
	String getReverseString(String input) {
		char[] ch = input.toCharArray();
		String reverse = "";

		for (int index = ch.length - 1; index >= 0; index--) {
			reverse = reverse + ch[index];
		}
		return reverse;
	}

	public static void main(String[] args) {
		Assignment_26_1 assignment_26_1 = new Assignment_26_1();
		System.out.println("Print a reverse string of given input :");
		String output = assignment_26_1.getReverseString("This is technocredits");
		System.out.println("Output-> " + output);
	}
}