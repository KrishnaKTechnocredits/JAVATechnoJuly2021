package somnath_Assignment_34; 
 
            /*program 3 : find first non repeating vowel character from given string.
			input : aeapquawrpti
			output : e */
 
public class Assignment_34_3{

	void firstNonRepeatingVowel(String input) {
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch=='a'||ch=='o'||ch=='e'||ch=='i'||ch=='u') {
				if(input.indexOf(ch)==input.lastIndexOf(ch)) {
					System.out.println("Output:- "+ch);
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		Assignment_34_3 as = new Assignment_34_3();
		as.firstNonRepeatingVowel("aeapquawrpti");
	}
}
