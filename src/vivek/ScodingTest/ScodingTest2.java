package vivek.ScodingTest;

public class ScodingTest2 {

	String changeCase(String str) {
		char ch = ' ';
		String newWord = "";

		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (Character.isDigit(ch))
				newWord += ch;
			else if (Character.isUpperCase(str.charAt(index))) {
				ch = Character.toLowerCase(str.charAt(index));
				newWord += ch;
			} else if (Character.isLowerCase(str.charAt(index))) {
				ch = Character.toUpperCase(str.charAt(index));
				newWord += ch;
			}
		}
		return newWord;
	}

	public static void main(String[] args) {
		ScodingTest2 scodingTest2 = new ScodingTest2();
		String str = "A1ashVi6";
		System.out.println(scodingTest2.changeCase(str));
	}
}
