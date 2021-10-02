package amol_Pawar.Assignment_43;

public class Assignment_43 {

	void getLenOfString(String input) {
		int count = 0;
		while (true) {
			try {
				input.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException ex) {
				break;
			}
		}
		System.out.println("length of String " + input + " is : " + count);
	}

	public static void main(String[] args) {
		Assignment_43 assignment_43 = new Assignment_43();
		assignment_43.getLenOfString("technocredits");

	}

}
/*
 * WAP to find length of string without length function Input “technocredits”
 * o/P: 13
 */