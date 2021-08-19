package vivek;

public class Assignment17 {

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		String name = "technocredits";
		System.out.println(assignment17.getReverseString(name));
	}
}
