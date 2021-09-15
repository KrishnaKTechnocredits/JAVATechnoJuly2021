package ashit;

public class CodingTest2 {

	void uperLowerCase(String str) {
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
		CodingTest2 test = new CodingTest2();
		test.uperLowerCase("A1ashvi6");
	}

}	

