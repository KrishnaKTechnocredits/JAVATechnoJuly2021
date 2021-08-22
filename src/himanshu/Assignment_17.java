package himanshu;

public class Assignment_17 {

	void getReverseString(String input) {

		char reverse=0;

		System.out.println(input);

		for (int index = input.length() - 1; index >= 0; index--) {

			reverse = input.charAt(index);
			
			System.out.print(reverse);
		}
		
	}

	public static void main(String[] args) {

		String input = "TechnoCredits";

		Assignment_17 assignment_17 = new Assignment_17();
		assignment_17.getReverseString(input);
	}

}

