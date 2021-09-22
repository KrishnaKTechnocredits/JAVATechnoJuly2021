package technocredits1.code_Interview;

public class Q13 {

	public static void main(String[] args) {
		String s = "abc12Zd29";
		String o = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'Z')
				o = o + 'A';
			else if (s.charAt(i) == '9')
				o = o + '0';
			else {
				int ascii = s.charAt(i);
				o = o + (char) (ascii + 1);
			}
		}
		System.out.println(o);
	}

}
