package madhavi;

public class Assignment_29_1 {

	void getPallindromeUsingReverse(String str) {

		char[] ch = str.toCharArray();
		String reverse = "";

		for (int index = ch.length - 1; index >= 0; index--) {
			reverse = reverse + ch[index];
		}
		if (str.equals(reverse)) {
			System.out.println( str + " is Pallindrome.");
		} else {
			System.out.println("Given String is not a Pallindrome.");
		}
	}

	public static void main(String[] args) {
		Assignment_29_1 assignment_29_1 = new Assignment_29_1();
		System.out.println(".....Find Pallindrome by writing reverse method logic.....");
		String input = "naman";
		System.out.println("String= " + input.toString());
		assignment_29_1.getPallindromeUsingReverse(input);

	}
}