package madhavi;

public class Assignment_43 {
	int count = 0;

	void getStringLength(String str) {

		while (true) {
			try {
				str.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}
		System.out.println("String " + str + " length is " + count);
	}

	public static void main(String[] args) {
		Assignment_43 assignment_43 = new Assignment_43();
		String input = "technocredits";
		assignment_43.getStringLength(input);

	}
}