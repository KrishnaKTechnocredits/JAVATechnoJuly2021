package technocredits1.code_Interview;

public class Q2 {

	public static void main(String[] args) {
		String s = "harsh";
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
}
