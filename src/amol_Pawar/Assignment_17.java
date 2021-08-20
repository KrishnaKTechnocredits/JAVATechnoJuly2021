package amol_Pawar;

public class Assignment_17 {

	void getReverseString(String input) {
		System.out.println("Reverse String of " + input + " is given below");
		for (int i = input.length() - 1; i >= 0; i--) {
			char rev = input.charAt(i);
			System.out.print(rev);
		}
	}

	public static void main(String[] args) {
		Assignment_17 assignment_17 = new Assignment_17();
		assignment_17.getReverseString("technocredits");
	}
}
