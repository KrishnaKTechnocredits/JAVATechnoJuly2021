package dattaraj;

public class Scoding_Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "technocredits";
		Scoding_Test6 test6 = new Scoding_Test6();
		test6.findFirstNonRepeatch(input);
	}
	
	void findFirstNonRepeatch(String input) {
		char output='\0';
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch == input.charAt(index) ) {
				if(index == input.lastIndexOf(ch) && index == input.lastIndexOf(ch)) {
						output = ch;
						break;
				}
			}
		}
		System.out.println("First non repeating character in " + input + " is " + output);
	}
}
