package suruchi.Assignment38;

public class Program_A38 {

	public static void main(String[] args) {

		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";

		System.out.println("String is: " + str);
		System.out
				.println("Substring of string is: " + str.substring(str.lastIndexOf("Hi"), str.indexOf("Aashvi") - 1));

	}
}