package technocredits1.code_Interview;

public class Q16 {

	public static void main(String[] args) {
		String str = "harsh";
		String output = "";

		for (int i = 0; i < str.length(); i++) {
			if (!output.contains(String.valueOf(str.charAt(i)))) {
				output += str.charAt(i);
			}
		}

		// for (int i = 0; i < str.length(); i++) {
		// if (i == str.indexOf(str.charAt(i))) { // OR i ==lastIndexOf(ch)
		// output += str.charAt(i);
		// }
		// }
		System.out.println(output);
	}
}
