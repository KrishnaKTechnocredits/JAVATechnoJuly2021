package dattaraj;

public class Assignment34_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aeapquawrpti";
		Assignment34_P3 p3 = new Assignment34_P3();
		p3.findFirstNonRepeatVowel(input);
	}
	
	void findFirstNonRepeatVowel(String input) {
		char output='\0';
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
				if(index == input.lastIndexOf(ch)) {
						output = ch;
						break;
				}
			}
		}
		System.out.println("First non repeating vowel in " + input + " is " + output);
	}

}
