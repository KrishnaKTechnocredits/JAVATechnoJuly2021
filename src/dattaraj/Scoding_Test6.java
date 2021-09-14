package dattaraj;

public class Scoding_Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "technocredits";
		String input2 = "hi this is techno gm credits this hi is";
		Scoding_Test6 test6 = new Scoding_Test6();
		test6.findFirstNonRepeatch(input);
		test6.findFirstNonRepeatWord(input2);
	}
	
	void findFirstNonRepeatWord(String input2) {
		// TODO Auto-generated method stub
		String[] arr = input2.split(" ");
		for(int index=0; index<arr.length; index++) {
			if(input2.indexOf(arr[index])==input2.lastIndexOf(arr[index])) {
				System.out.println("First non repeating word in '" + input2 + "' is " + arr[index]);
				break;
			}
		}	
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
