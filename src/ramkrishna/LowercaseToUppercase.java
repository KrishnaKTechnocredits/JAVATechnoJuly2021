package ramkrishna;

public class LowercaseToUppercase {

	void LowerCase(String str) {
		String input = "";

		for (int index=0; index< str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				input= input+ Character.toLowerCase(ch);
			}
			else if (Character.isLowerCase(ch)) {
				input= input+ Character.toUpperCase(ch); 
			}
			else
				input = input + ch;
		}
		System.out.println("String : " + input);
	}

	public static void main(String[] args) {
		LowercaseToUppercase lowercasetouppercase = new LowercaseToUppercase();
		lowercasetouppercase.LowerCase("A1ashvi6");
	}

}

