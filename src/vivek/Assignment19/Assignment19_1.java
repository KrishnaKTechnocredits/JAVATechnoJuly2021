package vivek.Assignment19;

public class Assignment19_1 {

	int getWordCount(String input) {
		String[] arr = input.split(" ");
		return arr.length;
	}

	public static void main(String[] args) {
		Assignment19_1 assignment19_1 = new Assignment19_1();
		String input = "Hi Techno Credits Hello";
		System.out.println(assignment19_1.getWordCount(input));
	}
}
