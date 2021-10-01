package chirag.assignment43;

public class CheckLengthOfString {
	
	void getLengthOfString(String input) {
		char [] ch = input.toCharArray();
		System.out.println(ch.length);
	}
	void getLengthOfStringWithoutUsingLength(String input) {
		int count=0;
		while(true) {
			try {
				char ch = input.charAt(count);
				count++;
			}catch(StringIndexOutOfBoundsException se) {
				break;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		CheckLengthOfString checkLengthOfString=new CheckLengthOfString();
		String input = "Technocredits";
		checkLengthOfString.getLengthOfString(input);
		checkLengthOfString.getLengthOfStringWithoutUsingLength(input);
	}
}