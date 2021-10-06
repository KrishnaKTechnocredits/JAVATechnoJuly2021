package varun.varun_string_assignment;

public class LengthOfStringWithoutUsingLengthMethod {
	
	void lengthOfString(String str) {
		int count=0;
		while(true) {
			try {
				str.charAt(count);
				count++;
			}catch(StringIndexOutOfBoundsException se) {
				break;
			}
		}
		System.out.println("Length of given string is: " +count);
	}
	public static void main(String[] args) {
		String input= "TechnoCredits";
		LengthOfStringWithoutUsingLengthMethod lengthOfStringWithoutUsingLengthMethod = new LengthOfStringWithoutUsingLengthMethod();
		lengthOfStringWithoutUsingLengthMethod.lengthOfString(input);
	}
}
