package madhavi;

public class Assignment_30_1 {
	String getReverseNumber(String str) {

		char[] ch = str.toCharArray();
		String reverse = "";

		for (int index = ch.length - 1; index >= 0; index--) {
			reverse = reverse + ch[index];
		}
		return reverse;
	}

	public static void main(String[] args) {
		Assignment_30_1 assignment_30_1 = new Assignment_30_1();
		System.out.println(".....Write a method to reverse a given number.....");
		String input = "1932";
		System.out.println("Input= " + input.toString());
		System.out.println("Reverse number is ");
		System.out.println("Output= " + assignment_30_1.getReverseNumber(input));

	}
}
