package technocredits1.code_Interview;

public class Q6 {

	public static void main(String[] args) {
		String s1 = "Ankita";
		String s2 = "Amruta";

		for (int i = 0; i < s1.length(); i++) {
			if (!(s1.contains(String.valueOf(s2.charAt(i))) && s2.contains(String.valueOf(s1.charAt(i))))) {
				System.out.println(s1.charAt(i));
				System.out.println(s2.charAt(i));
				break;
			}
		}
	}
}
