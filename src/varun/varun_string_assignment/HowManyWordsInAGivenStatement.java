package varun.varun_string_assignment;

public class HowManyWordsInAGivenStatement {

	void givenStatement(String arr) {
		int count = 0;
		String[] input = arr.split(" ");
		for (int index = 0; index < input.length; index++)
			count++;
		System.out.println("Total Words from a given statement is:- " +count);
	}
	

	public static void main(String[] args) {
		HowManyWordsInAGivenStatement assignment_19_1 = new HowManyWordsInAGivenStatement();
		String input = "Hi Techno Credits Hello";
		assignment_19_1.givenStatement(input);
	}
}
