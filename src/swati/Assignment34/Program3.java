/*
 * program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : e
 */
package swati.Assignment34;

public class Program3 {
	
	void nonRepeatingVowel(String input) {
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch=='a'||ch=='o'||ch=='e'||ch=='i'||ch=='u') {
				if(input.indexOf(ch)==input.lastIndexOf(ch)) {
					System.out.println("Output: "+ch);
					break;
				}
			}
		}
	}

	public static void main(String[] a) {
		Program3 p1=new Program3();
		p1.nonRepeatingVowel("aeapquawrpti");
	}
}
