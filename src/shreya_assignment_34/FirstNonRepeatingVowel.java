package shreya_assignment_34;

public class FirstNonRepeatingVowel {
	void getNonRepeatingVowel(String str) {
		char vowel=' ';
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			int count=0;
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				vowel=ch;
				count++;
				}
			}
			
			if(count==1) {
				break;
			}
		}
		System.out.println("First non-repeating vowel from the string: "+vowel);
	}
	public static void main(String[] args) {
		FirstNonRepeatingVowel firstNonRepeatingVowel=new FirstNonRepeatingVowel();
		String str="aeapquawrpti";
		firstNonRepeatingVowel.getNonRepeatingVowel(str);
	}

}
