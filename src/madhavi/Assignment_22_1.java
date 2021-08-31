package madhavi;

public class Assignment_22_1 {
	int count = 0;

	int Gettotaldigits(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			//boolean isDigit = Character.isDigit(ch);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		//Assignment_22_1 assignment_22_1 = new Assignment_22_1();
		System.out.println("Print total digits in a given string. ");
		String str = "Te1ch2no3cr4ed3it4s";
		System.out.println(new Assignment_22_1().Gettotaldigits(str));
	}
}